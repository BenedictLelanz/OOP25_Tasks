package main.generics.tasks;

import java.util.Collection;
import java.util.Set;

public class TestResult<S, T extends Collection<S>> implements Comparable<TestResult<S, T>> {

    public static boolean compareByAddTime = false;

    private final Set<S> testSet;

    private final T collection;

    final long timeAdd;

    final long timeContains;

    TestResult(Set<S> testSet, T collection, long timeAdd, long timeContains) {
        this.testSet = testSet;
        this.collection = collection;
        this.timeAdd = timeAdd;
        this.timeContains = timeContains;
    }

    @Override
    public String toString() {
        return "TestResult[testSize: " + this.testSet.size() + 
            ", collectionName: " + this.collection.getClass().getSimpleName() + 
            ", timeAdd: " + this.timeAdd + 
            ", timeContains: " + this.timeContains +
            "]";
    }

    @Override
    public int compareTo(TestResult<S, T> tr) {
        if (compareByAddTime)
            return Long.compare(this.timeAdd, tr.timeAdd);
        return Long.compare(this.timeContains, tr.timeContains);
    }
    
}
