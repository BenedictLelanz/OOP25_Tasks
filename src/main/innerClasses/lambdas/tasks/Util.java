package main.innerClasses.lambdas.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import main.abstraction.interfaces.lecture.Person;

public class Util {

    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int sum = reduce(list, (a, b) -> a + b);
        System.out.println(sum);

        List<String> list1 = new ArrayList<>(Arrays.asList("abc", "ef", "g"));
        String longest = reduce(list1, (a, b) -> a.length() > b.length() ? a : b);
        System.out.println(longest);

        List<String> list2 = new ArrayList<>(Arrays.asList("123", "99", "5254"));
        List<Integer> mapped = map(list2, Integer::parseInt);
        System.out.println(mapped);

        List<String> list3 = new ArrayList<>(Arrays.asList("abc", "ef", "g"));
        List<String> upperCaseList = map(list3, String::toUpperCase);
        System.out.println(upperCaseList);

        List<Person> list4 = new ArrayList<>(Arrays.<Person>asList(
            new Person("Hans", 12),
            new Person("Peter", 20)
        ));
        filter(list4, p -> p.getAge() > 18);

        List<Supplier<Integer>> list5 = new ArrayList<>(Arrays.asList(
                () -> -2,
                () -> 6,
                () -> 3 * 5));
        filter(list5, e -> e.get() > 0);
    }

    static <T> T reduce(List<T> elements, Link<T> link) {
        T current = elements.get(0);
        for (int i = 1; i < elements.size(); i++)
            current = link.link(current, elements.get(i));
        return current;
    }

    static <T, R> List<R> map(List<T> elements, Function<T, R> mapper) {
        List<R> mapped = new ArrayList<>();
        elements.forEach(e -> mapped.add(mapper.apply(e)));
        return mapped;
    }

    static <T> List<T> filter(List<T> elements, Predicate<T> pr) {
        List<T> result = new ArrayList<>();
        elements.forEach(e -> {
            if (pr.test(e))
                result.add(e);
        });
        return result;
    }

}
