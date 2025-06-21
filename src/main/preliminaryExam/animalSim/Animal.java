package main.preliminaryExam.animalSim;

public abstract class Animal extends Thread {

    public static final int RUN_INTERVAL = Enviroment.DAY_DURATION / 10;

    private final Enviroment env;

    private final String name;

    private final int lifetime;

    private boolean died = false;

    Animal(Enviroment env, String name, int lifetime) {
        this.env = env;
        this.name = name;
        this.lifetime = lifetime;
        start();
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        while (!this.env.isStopped() && (System.currentTimeMillis() - startTime < this.lifetime) && !died)
            live();
        System.out.println("Animal " + this.name + " died.");
        this.died = true;
    }

    public boolean isDied() {
        return this.died;
    }

    public void die() {
        this.died = true;
    }

    public abstract void live();
    
}
