package main.generics.tasks;

import java.util.HashSet;
import java.util.Set;

public class IntGenerator implements TestDataGenerator<Integer> {

    private final int lowerBound;
    private final int upperBound;

    IntGenerator(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public Set<Integer> generate(int amount) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < amount; i++)
            set.add((int) (this.lowerBound + Math.random() * (this.upperBound - this.lowerBound)));
        return set;
    }
    
}
