package main.innerClasses.innerClasses.tasks;

import java.util.function.Supplier;

public class TaskTimeConverter {

    public static void main(String[] args) {
        
        // Anonymous inner class
        Runnable task = new Runnable() {

            @Override
            public void run() {
                int i = 0;
                while (i < 100_000) {
                    i++;
                    System.out.println();
                }
            }
            
        };

        // Lazy evaluation -> only convert, not execute
        Supplier<Integer> timedTask = new TaskTimeConverter().convert(task);

        // Execute converted task
        System.out.println(timedTask.get());
    }

    Supplier<Integer> convert(Runnable task) {

        // Local inner class
        class TimedTask implements Supplier<Integer> {

            @Override
            public Integer get() {
                long startTime = System.currentTimeMillis();
                task.run();
                return (int) (System.currentTimeMillis() - startTime);
            }
            
        }
        
        return new TimedTask();
    }
    
}
