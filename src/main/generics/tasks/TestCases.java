package main.generics.tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestCases {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        TestCases tc = new TestCases();

        TestDataGenerator<Integer> tgb = new IntGenerator(0, 10_000);
        System.out.println("Start generating ints");
        Set<Integer> ints = tgb.generate(10_000_000);
        System.out.println("Generating ints done");
        List<TestResult<?, ?>> resultsInt = tc.testForAll(ints);
        tc.printTestResults("intTest10_000", resultsInt);

        TestDataGenerator<String> tgb1 = new StringGenerator();
        System.out.println("Start generating strings");
        Set<String> strings = tgb1.generate(10_000);
        System.out.println("Generating strings done");
        List<TestResult<?, ?>> resultsString = tc.testForAll(strings);
        tc.printTestResults("stringTest10_000", resultsString);

        System.out.println("All tests done in " + (System.currentTimeMillis() - startTime) + "ms");
    }

    private void printTestResults(String name, List<TestResult<?, ?>> results) {
        System.out.println(name);
        for (int i = 0; i < results.size(); i++)
            System.out.println(results.get(i));
        System.out.println();
    }

    private <S> List<TestResult<?, ?>> testForAll(Set<S> testSet) {
        List<TestResult<?, ?>> results = new ArrayList<>();
        results.add(generateResult(testSet, new HashSet<S>()));
        results.add(generateResult(testSet, new TreeSet<S>()));
        results.add(generateResult(testSet, new LinkedList<S>()));
        results.add(generateResult(testSet, new ArrayList<S>()));
        Collections.sort(results);
        return results;
    }

    private <S, T extends Collection<S>> TestResult<S, T> generateResult(Set<S> testSet, T coll) {
        AddTestCase<S, T> add = new AddTestCase<>();
        long time1 = add.runTest(testSet, coll);
        ContainsTestCase<S, T> contains = new ContainsTestCase<>();
        long time2 = contains.runTest(testSet, coll);
        TestResult<S, T> tr = new TestResult<>(testSet, coll, time1, time2);
        return tr;
    }
    
}
