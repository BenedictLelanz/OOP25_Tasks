package main.multithreading.lecture;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPools {

    public static void main(String[] args) {
        
        ScheduledExecutorService ses = new ScheduledThreadPoolExecutor(5);

        ses.execute(() -> System.out.println("fehwiof"));
        ses.schedule(() -> System.out.println("hello world"), 1_000, TimeUnit.MILLISECONDS);

        ses.scheduleAtFixedRate(() -> System.out.println("scheduled at fixed rate"), 500, 500, TimeUnit.MILLISECONDS);

    }
    
}
