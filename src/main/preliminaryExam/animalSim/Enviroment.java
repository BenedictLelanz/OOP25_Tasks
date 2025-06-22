package main.preliminaryExam.animalSim;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Enviroment {

    public static enum EnvProp {
        WACHSTUMSRATE, BLÄTTER;
    }

    public static final int PRINT_INTERVAL = 500;

    public static final int SAVE_INTERVAL = 2_000;

    public static final int DAY_DURATION = 500;

    public static final String FILE_NAME = "res/env_states.env";

    private final Map<EnvProp, Double> values;

    private final Thread printerThread;

    private final Thread saverThread;

    private final Thread simThread;

    private int day = 0;

    private boolean stopped = false;

    Enviroment() {
        this(new HashMap<>());
    }

    Enviroment(String fileName) {
        this(new MapConverter<EnvProp, Double>().readMap(fileName,
                k -> EnvProp.valueOf(k), v -> Double.parseDouble(v)));
    }

    Enviroment(Map<EnvProp, Double> states) {
        this.values = states;

        // Default values
        this.values.putIfAbsent(EnvProp.WACHSTUMSRATE, 10.);
        this.values.putIfAbsent(EnvProp.BLÄTTER, 1_000_000.);

        // Schedulers
        this.printerThread = new EnvScheduler(() -> {
            System.out.println("States at day " + this.day);
            for (Entry<EnvProp, Double> e : this.values.entrySet())
                System.out.println(e.getKey() + " -> " + e.getValue());
            System.out.println();
        }, PRINT_INTERVAL);

        final MapConverter<EnvProp, Double> mapSaver = new MapConverter<>();
        this.saverThread = new EnvScheduler(() -> {
            mapSaver.saveMap(this.values, FILE_NAME);
        }, SAVE_INTERVAL);

        this.simThread = new EnvScheduler(() -> {
            // Increase leaf count by EnvProp.WACHSTUMSRATE
            set(EnvProp.BLÄTTER, ((1 + get(EnvProp.WACHSTUMSRATE) / 100) * get(EnvProp.BLÄTTER)));
            // Other env changes ...
            this.day++;
        }, DAY_DURATION);
    }

    public synchronized void set(EnvProp property, double value) {
        this.values.put(property, value);
    }

    public synchronized double get(EnvProp property) {
        return values.getOrDefault(property, 0.);
    }

    public int getCurrentDay() {
        return this.day;
    }

    public void stopSimulation() {
        this.printerThread.interrupt();
        this.saverThread.interrupt();
        this.simThread.interrupt();
        this.stopped = true;
    }

    public boolean isStopped() {
        return this.stopped;
    }

    class EnvScheduler extends Thread {

        private final Runnable task;

        private final int sleep;

        EnvScheduler(Runnable task, int sleep) {
            this.task = task;
            this.sleep = sleep;
            this.start();
        }

        @Override
        public void run() {
            while (!Thread.interrupted()) {
                synchronized (Enviroment.this) {
                    this.task.run();
                }
                try {
                    Thread.sleep(this.sleep);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }

    }

}
