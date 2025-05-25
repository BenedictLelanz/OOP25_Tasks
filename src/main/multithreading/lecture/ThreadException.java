package main.multithreading.lecture;

public class ThreadException {

    public static void main(String[] args) throws Throwable {
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().threadId());
            throw new Exception();
        });

        // Eigener Exception Handler (von t1 ausgeführt)
        t1.setUncaughtExceptionHandler((t, e) -> {
            System.out.println("got exception, executed by: " + t.threadId());
        });

        t1.start();

        // Der Hauptthread soll warten, bis t1 fertig ist
        // Sonst würden wir nichts von der Exception merken)
        t1.join();

        System.out.println("hello world");
    }
    
}
