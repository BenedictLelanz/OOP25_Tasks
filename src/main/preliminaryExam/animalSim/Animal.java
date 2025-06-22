package main.preliminaryExam.animalSim;

public abstract class Animal extends Thread {

    public static final int RUN_INTERVAL = Enviroment.DAY_DURATION / 10;

    private final Enviroment env;

    private final int initAge;

    private final int maxAge;

    private final int birthday;

    private double age;

    private int generation;

    private boolean masculine;

    Animal(Enviroment env, int age, int maxAge, int generation, boolean masculine) {
        this.env = env;
        this.initAge = age;
        this.maxAge = maxAge;
        this.birthday = env.getCurrentDay();
        this.age = age;
        this.generation = generation;
        this.masculine = masculine;
    }

    @Override
    public void run() {
        born();
        long startTime = System.currentTimeMillis();
        while (!this.env.isStopped() && this.age < this.maxAge && !Thread.interrupted()) {
            this.age = this.initAge + (System.currentTimeMillis() - startTime) / Enviroment.DAY_DURATION;
            live();
            try {
                Thread.sleep(RUN_INTERVAL);
            } catch (InterruptedException e) {
                interrupt();
            }
        }
        died();
    }

    protected Enviroment getEnviroment() {
        return this.env;
    }

    protected double getAge() {
        return this.age;
    }

    protected int getBirthday() {
        return this.birthday;
    }

    protected int getGeneration() {
        return this.generation;
    }

    protected boolean isMasculine() {
        return this.masculine;
    }

    protected void die() {
        interrupt();
    }

    protected abstract void born();

    protected abstract void live();

    protected abstract void died();
    
}
