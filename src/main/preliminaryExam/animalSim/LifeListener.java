package main.preliminaryExam.animalSim;

public interface LifeListener<T extends Animal> {

    void born(int generation);

    void died(int generation);
    
}
