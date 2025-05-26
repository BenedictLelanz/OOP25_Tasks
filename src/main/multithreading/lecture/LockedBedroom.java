package main.multithreading.lecture;

public class LockedBedroom {

    void bedroom1() {
        System.out.println(Thread.currentThread().getName() + " goes sleeping");
        synchronized (this) {
            try {
                Thread.sleep(2_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished sleeping");
    }

    void bedroom2() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " goes sleeping");
            try {
                Thread.sleep(2_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " finished sleeping");
        }
    }

    public static void main(String[] args) {
        LockedBedroom s = new LockedBedroom();
        new Thread(() -> s.bedroom1()).start();
        new Thread(() -> s.bedroom2()).start();
    }

}
