package main.multithreading.lecture;

public class Interrupted {

    public static void main(String[] args) throws InterruptedException {

        Thread looper = new Thread(() -> {
            int i = 0;
            while (true) {
                System.out.println(i++);
                if (Thread.interrupted())
                    break;
            }
        });

        looper.start();

        Thread.sleep(1000);

        looper.interrupt();

        System.out.println("Looper interrupted: " + looper.isInterrupted());

    }

}
