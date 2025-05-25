package main.generics.tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestCasesThreads {

    private final List<Thread> threads = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        TestCasesThreads tc = new TestCasesThreads();

        List<TestResult<?, ?>> resultsInt = new ArrayList<>();
        Thread intTester = new Thread(() -> {
            TestDataGenerator<Integer> tgb = new IntGenerator(0, 10_000);
            Set<Integer> ints = tgb.generate(10_000_000);
            tc.testForAll(ints, resultsInt);
        });

        List<TestResult<?, ?>> resultsString = new ArrayList<>();
        Thread stringTester = new Thread(() -> {
            TestDataGenerator<String> tgb1 = new StringGenerator();
            Set<String> strings = tgb1.generate(10_000);
            tc.testForAll(strings, resultsString);
        });

        intTester.start();
        stringTester.start();

        intTester.join();
        stringTester.join();

        // Durch das join wurde tc.threads bereits mit allen Threads aus testForAll gefüllt

        for (Thread thread : tc.threads)
            thread.join();

        System.out.println("All tests done in " + (System.currentTimeMillis() - startTime) + "ms");
        tc.printTestResults("intTest10_000", resultsInt);
        tc.printTestResults("stringTest10_000", resultsString);
    }

    private void printTestResults(String name, List<TestResult<?, ?>> results) {
        System.out.println(name);
        for (int i = 0; i < results.size(); i++)
            System.out.println(results.get(i));
        System.out.println();
    }

    private <S> void testForAll(Set<S> testSet, List<TestResult<?, ?>> results) {
        List<Thread> testerThreads = new ArrayList<>();
        testerThreads.add(new Thread(() -> results.add(generateResult(testSet, new HashSet<S>()))));
        testerThreads.add(new Thread(() -> results.add(generateResult(testSet, new TreeSet<S>()))));
        testerThreads.add(new Thread(() -> results.add(generateResult(testSet, new LinkedList<S>()))));
        testerThreads.add(new Thread(() -> results.add(generateResult(testSet, new ArrayList<S>()))));
        testerThreads.forEach(t -> t.start());
        this.threads.addAll(testerThreads);
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
