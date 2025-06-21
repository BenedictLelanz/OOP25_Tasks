package main.preliminaryExam.animalSim;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Enviroment {

    private static enum DefaultValue {
        WACHSTUMSRATE, BLÄTTER;
    }

    public static final int PRINT_INTERVAL = 500;

    public static final int SAVE_INTERVAL = 2_000;

    public static final int DAY_DURATION = 1_000;

    private static final String FILE_NAME = "states.env";

    private final MapConverter<String, Double> mapConverter;

    private final Map<String, Double> values;

    private final Thread printerThread;

    private final Thread saverThread;

    private final Thread simThread;

    private int day = 0;

    private boolean stopped = false;

    Enviroment() {
        this(new HashMap<>());
    }

    Enviroment(String fileName) {
        this(new MapConverter<String, Double>().readMap(fileName));
    }

    Enviroment(Map<String, Double> states) {
        this.mapConverter = new MapConverter<>();
        this.values = states;
        checkDefaultValues();

        this.printerThread = new Thread(() -> runPrinter());
        this.saverThread = new Thread(() -> runSaver());
        this.simThread = new Thread(() -> runDays());
        this.printerThread.start();
        this.saverThread.start();
        this.simThread.start();
    }

    private void nextDay(int currentDay) {
        String bl = DefaultValue.BLÄTTER.name();
        String wa = DefaultValue.WACHSTUMSRATE.name();
        // Blätter vermehren sich täglich um 10%
        set(bl, ((1 + get(wa) / 100) * get(bl)));
        // TODO other changes?!
    }

    private void checkDefaultValues() {
        if (this.values.get(DefaultValue.WACHSTUMSRATE.name()) == null)
            this.values.put(DefaultValue.WACHSTUMSRATE.name(), 10.0);
        if (this.values.get(DefaultValue.BLÄTTER.name()) == null)
            this.values.put(DefaultValue.BLÄTTER.name(), 1_000_000.0);
    }

    private void runDays() {
        while (!Thread.interrupted()) {
            nextDay(this.day);
            this.day++;
            try {
                Thread.sleep(DAY_DURATION);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void runSaver() {
        while (!Thread.interrupted()) {
            this.mapConverter.saveMap(this.values, FILE_NAME);
            try {
                Thread.sleep(SAVE_INTERVAL);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void runPrinter() {
        while (!Thread.interrupted()) {
            synchronized (this) {
                System.out.println("States at day " + this.day);
                for (Entry<String, Double> e : this.values.entrySet())
                    System.out.println(e.getKey() + " -> " + e.getValue());
                System.out.println();
            }
            try {
                Thread.sleep(PRINT_INTERVAL);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public synchronized void set(String property, double value) {
        this.values.put(property, value);
    }

    public synchronized double get(String property) {
        if (values.get(property) == null) return 0;
        return values.get(property);
    }

    public int getDay() {
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
    
}
