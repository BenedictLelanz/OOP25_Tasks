package main.innerClasses.lambdas.lecture;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Lambda {

    public static void main(String[] args) {
        // 1. Runnable as lambda
        Runnable greeting = () -> System.out.println("Hello World!");
        greeting.run();

        // 2. Consumer (takes a value and performs an action)
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        printUpperCase.accept("lambda is fun");

        // 3. Function (takes a value and returns something)
        Function<String, Integer> wordLength = s -> s.length();
        System.out.println("Length: " + wordLength.apply("Lambda"));

        // 4. Predicate (returns boolean)
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        // 5. Supplier (provides a value)
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random value: " + randomValue.get());

        // 6. Filter a list using a Predicate
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Anna");
        List<String> startingWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Names starting with A: " + startingWithA);

        // 7. Transform a list using map
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> squared = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squared numbers: " + squared);
    }
}
