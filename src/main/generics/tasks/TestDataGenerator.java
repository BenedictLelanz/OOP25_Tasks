package main.generics.tasks;

import java.util.Set;

public interface TestDataGenerator<S> {

    /**
     * Generates amount values of type S.
     * @param amount
     * @return a random set of type S
     */
    Set<S> generate(int amount);
    
}
