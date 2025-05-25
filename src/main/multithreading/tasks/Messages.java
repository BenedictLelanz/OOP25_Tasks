package main.multithreading.tasks;

import java.util.ArrayList;
import java.util.List;

public class Messages {

    static final int LISTENING_TIMEOUT = 3_000;
    static final int MAX_SLEEP = 300;

    /**
     * All sender threads
     */
    private final Thread[] senders;

    /**
     * Global list of all messages
     */
    volatile List<String> messages = new ArrayList<>();

    /**
     * Sent messages counter
     */
    volatile int sentMessages = 0;

    Messages(int n) {
        this.senders = new Thread[n];

        for (int i = 0; i < n; i++) {
            // Create new message sender thread
            this.senders[i] = new Thread(() -> {
                // Loop until interrupt
                while (!Thread.interrupted()) {
                    this.sentMessages++;
                    this.messages.add("Message from " + Thread.currentThread().getName());
                    // Sleep random amount of time
                    try {
                        Thread.sleep((int) (Math.random() * MAX_SLEEP));
                    } catch (InterruptedException e) {
                        // InterruptedException would reset the flag -> interrupt again
                        Thread.currentThread().interrupt();
                    }
                }
            }, "MessageBroker" + i);
            // Start sender thread
            this.senders[i].start();
        }

        // Listen to messages for some seconds
        listenToMessages();

        // Print message count
        System.out.println("Threads sent " + this.sentMessages + " messages");
        System.out.println("Main thread received " + this.messages.size() + " messages");
    }

    /**
     * Method for the main thread to check for new messages
     */
    void listenToMessages() {
        // To check if the message list has been extended
        int currentMessageCount = 0;
        // To check the passed time
        long currentTime = System.currentTimeMillis();
        // Flag indicating if LISTENING_TIMEOUT time is not over yet
        boolean listen = true;
        // Start listening
        while (listen) {
            listen = System.currentTimeMillis() - currentTime < LISTENING_TIMEOUT;
            if (!listen) {
                // Interrupt all sender threads
                for (int i = 0; i < this.senders.length; i++)
                    this.senders[i].interrupt();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            final int newMessageSize = messages.size();
            // Check if new message size is greater than current -> new messages
            if (newMessageSize > currentMessageCount) {
                System.out.println("Main thread received new messages:");
                for (int i = currentMessageCount; i < newMessageSize; i++)
                    System.out.println(messages.get(i));
                System.out.println();
                currentMessageCount = newMessageSize;
            }
        }
    }

    public static void main(String[] args) {
        new Messages(5);
    }

}
