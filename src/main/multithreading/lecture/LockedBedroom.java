package main.multithreading.lecture;

public class LockedBedroom {

    synchronized void bedroom() {
        System.out.println(Thread.currentThread().getName() + " goes sleeping");
        try {
            Thread.sleep(2_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished sleeping");
    }

    public static void main(String[] args) {
        LockedBedroom s = new LockedBedroom();
        new Thread(() -> s.bedroom()).start();
        new Thread(() -> s.bedroom()).start();
    }
    
}
