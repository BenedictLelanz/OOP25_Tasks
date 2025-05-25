package main.multithreading.lecture;

public class Async {

    int i = 5;

    void mult2() {
        i = i * 2;
    }

    void add1() {
        i = i + 1;
    }

    void runSeq() {
        mult2();
        add1();
        System.out.println("i after sequential code: " + i);
    }

    void runAsync() {
        Thread mult2Runner = new Thread(() -> mult2());
        Thread add1Runner = new Thread() {

            @Override
            public void run() {
                add1();
            }

        };
        mult2Runner.start();
        add1Runner.start();

        try {
            mult2Runner.join();
            add1Runner.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        // Erwartungen???
        System.out.println(i);
    }

    public static void main(String[] args) {
        Async e = new Async();
        e.runAsync();
    }
    
}
