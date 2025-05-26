package main.multithreading.lecture;

import java.util.concurrent.Semaphore;

public class DiningPhillosophers {

    public static int DURATION = 1000;

    public static void main(String[] args) throws InterruptedException {
        int count = 5;

        Semaphore s = new Semaphore(count - 1);

        // Create sticks
        Stick[] sticks = new Stick[count];
        for (int i = 0; i < count; i++)
            sticks[i] = new Stick();

        // Create phillosophers
        Phillosopher[] phills = new Phillosopher[count];
        for (int i = 0; i < count; i++) {
            phills[i] = new Phillosopher(sticks[i], sticks[(i + 1) % count], "Phil " + i, s);
            phills[i].start();
        }

        Thread.sleep(20_000);

        for (Phillosopher p : phills) {
            p.interrupt();
            System.out.println(p.getName() + " ate " + p.getEatingCount());
        }
    }

}

class Stick {
}

class Phillosopher extends Thread {

    private final Stick left;
    private final Stick right;
    private final String name;
    private final Semaphore sem;
    private int eatingCount;

    Phillosopher(Stick left, Stick right, String name, Semaphore sem) {
        super(name);
        this.left = left;
        this.right = right;
        this.name = name;
        this.sem = sem;
    }

    int getEatingCount() {
        return this.eatingCount;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            System.out.println(name + " is thinking");
            try {
                this.sem.acquire();
                synchronized (left) {
                    System.out.println(name + " took left stick");
                    synchronized (right) {
                        System.out.println(name + " took right stick and starts eating");
                        this.eatingCount++;
                        Thread.sleep((int) (Math.random() * DiningPhillosophers.DURATION));
                        System.out.println(name + " finished eating");
                    }
                }
                this.sem.release();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

}
