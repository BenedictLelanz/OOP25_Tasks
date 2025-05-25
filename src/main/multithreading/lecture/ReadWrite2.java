package main.multithreading.lecture;

public class ReadWrite2 {

    static int counter = 0;

    static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        int threadCount = 100;
        int incCount = 10_000;

        Thread[] threads = new Thread[threadCount];
        for (int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(() -> {
                for (int k = 0; k < incCount; k++) {
                    counter += 1;
                }
            });
            threads[i].start();
        }

        for (int i = 0; i < threadCount; i++)
            threads[i].join();

        System.out.println(counter);        
    }
    
}
