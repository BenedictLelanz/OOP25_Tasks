package main.multithreading.lecture;

public class DiningPhillosophers {

    public static int DURATION = 100;

    public static void main(String[] args) throws InterruptedException {
        int count = 5;

        // Create sticks
        Stick[] sticks = new Stick[count];        
        for (int i = 0; i < count; i++)
            sticks[i] = new Stick();
        
        // Create phillosophers
        Phillosopher[] phills = new Phillosopher[count];
        for (int i = 0; i < count; i++) {
            phills[i] = new Phillosopher(sticks[i], sticks[(i + 1) % count], "Phil " + i);
            phills[i].start();
        }
    }

}

class Stick {}

class Phillosopher extends Thread {

    private final Stick left;
    private final Stick right;
    private final String name;
    private int eatingCount;

    Phillosopher(Stick left, Stick right, String name) {
        super(name);
        this.left = left;
        this.right = right;
        this.name = name;
    }

    int getEatingCount() {
        return this.eatingCount;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(name + " is thinking");
            synchronized (left) {
                System.out.println(name + " took left stick");
                synchronized (right) {
                    System.out.println(name + " took right stick and starts eating");
                    this.eatingCount++;
                    try {
                        Thread.sleep((int) (Math.random() * DiningPhillosophers.DURATION));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(name + " finished eating");
                }
            }
        }
    }

}
