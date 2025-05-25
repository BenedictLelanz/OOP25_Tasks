package main.multithreading.tasks;

public class ThreadExit {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (!Thread.interrupted()) {
                System.out.println("Hello");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        thread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();
    }

}
