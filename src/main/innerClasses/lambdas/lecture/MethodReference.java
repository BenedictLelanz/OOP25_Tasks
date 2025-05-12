package main.innerClasses.lambdas.lecture;

import java.util.*;
import java.util.function.*;

public class MethodReference {

    public static void main(String[] args) {
        // 1. Static method reference
        Function<String, Integer> parseInt = Integer::parseInt;
        System.out.println("Parsed number: " + parseInt.apply("42"));

        // 2. Instance method of an object
        String prefix = "Hello, ";
        Function<String, String> addPrefix = prefix::concat;
        System.out.println(addPrefix.apply("world"));

        // 3. Instance method on class name
        exec(String::toLowerCase);
        exec(String::toCharArray);

        // 4. Constructor reference
        
        Supplier<List<String>> listFactory = ArrayList::new;
        Supplier<List<String>> listFactory1 = () -> new ArrayList<String>();

        Function<String, X> xConstrLam = (s) -> new X(s);
        Function<String, X> xConstr = X::new;

        List<String> newList = listFactory.get();
        newList.add("one");
        newList.add("two");
        System.out.println("New list: " + newList);

        exec(String::toLowerCase);
    }

    static void exec(Consumer<String> c) {
        c.accept("hallo");

        bi(String::concat, "adsdfs");
        "hello ".concat("world");
    }

    static String bi(BiFunction<String, String, String> bi, String a) {
        return bi.apply("hello ", a);
    }
}

class X {

    X(String a) {

    }

}
