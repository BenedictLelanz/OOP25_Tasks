package main.multithreading.lecture;

public class ReadWrite {

    int c = 0;

    void inc() {
        int current = c;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c = current + 1;
    }

    void dec() {
        int current = c;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c = current - 1;
    }

    public static void main(String[] args) throws InterruptedException {
        int counter = 0;
        while (true) {
            counter ++;

            ReadWrite rw = new ReadWrite();
            Thread t1 = new Thread(() -> rw.c = rw.c + 1);
            Thread t2 = new Thread(() -> rw.c = rw.c - 1);

            t1.start();
            t2.start();

            t1.join();
            t2.join();
            
            if (rw.c != 0)
            break;
        }
        System.out.println("!= 0 after " + counter + " steps");
    }

}
