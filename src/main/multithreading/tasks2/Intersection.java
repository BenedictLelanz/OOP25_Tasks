package main.multithreading.tasks2;

import java.util.concurrent.Semaphore;

/*
 * 
 * Timo Müller
 */
public class Intersection {

    final static long DURATION = 100;

    public static void main(String[] args) {
        Intersection intersection = new Intersection();
        
        new Car(intersection, 0).start();
        new Car(intersection, 1).start();
        new Car(intersection, 2).start();
        new Car(intersection, 3).start();
        
    }


    public void drive(int id) throws InterruptedException{
        System.out.println("Car" + id + " fährt los");
        Thread.sleep(Math.round(DURATION * Math.random()));
        
        Lane currentLane = Lane.fromId(id);
        Lane rightLane = Lane.fromId((id + 1) % 4);

        currentLane.acquire();
        System.out.println("Car" + id + " steht an der Kreuzung");

        Thread.sleep(Math.round(DURATION * Math.random()));
        
        if(Lane.allBlocked()){
            currentLane.release();
            Thread.sleep(100);
            currentLane.acquire();
        }

        rightLane.acquire();
        System.out.println("Car" + id + " fährt über die Kreuzung");
        Thread.sleep(Math.round(DURATION * Math.random()));
        rightLane.release();

        currentLane.release();
        Thread.sleep(Math.round(DURATION * Math.random()));
    }
}


enum Lane {
    Lane0,
    Lane1,
    Lane2,
    Lane3;

    private Semaphore s;

    Lane(){
        this.s = new Semaphore(1);
    }

    static boolean allBlocked() {
        for(Lane l : Lane.values()){
            if(l.s.availablePermits() != 0) return false;
        }
        return true;
    }

    public static Lane fromId(int id){
        return Lane.valueOf("Lane" + Math.abs(id));
    }

    public void acquire() throws InterruptedException{
        s.acquire();
    }

    public void release(){
        s.release();
    }
}


class Car extends Thread{
    Intersection intersection;
    int id;

    Car(Intersection intersection, int id){
        this.intersection = intersection;
        this.id = id;
    }

    @Override
    public void run() {
        while(true){
            synchronized(this){
                
                try {
                    intersection.drive(id);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            
        }
    }
}
