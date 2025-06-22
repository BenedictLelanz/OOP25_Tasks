package main.preliminaryExam.animalSim;

import main.preliminaryExam.animalSim.Enviroment.EnvProp;

public class Velandrakon extends Animal {

    public static final int LIFETIME = 20;

    public static final int REPRODUCTION_DAY = 15;

    public static final int REPRODUCTION_COUNT = 4;

    public static final int EATING_LEAVES = 527;

    private boolean reproduced = false;

    private final LifeListener<Velandrakon> lifeListener;

    Velandrakon(Enviroment env, int age, int gen, LifeListener<Velandrakon> reprodListener) {
        super(env, age, LIFETIME, gen, Math.random() < 0.5);
        this.lifeListener = reprodListener;
        super.start();
    }

    @Override
    public void born() {
        this.lifeListener.born(getGeneration());
    }

    @Override
    public void live() {
        // Eat leaves
        synchronized(getEnviroment()) {
            double leafes = getEnviroment().get(EnvProp.BLÄTTER);
            if (leafes < EATING_LEAVES)
                die();
            else
                getEnviroment().set(EnvProp.BLÄTTER, leafes - EATING_LEAVES);
        }

        // Reproduction
        if (!this.reproduced && getAge() == REPRODUCTION_DAY && !isMasculine())
            for (int i = 0; i < REPRODUCTION_COUNT; i++)
                new Velandrakon(getEnviroment(), 0, getGeneration() + 1, this.lifeListener);   
    }

    @Override
    public void died() {
        this.lifeListener.died(getGeneration());
    }
    
}
