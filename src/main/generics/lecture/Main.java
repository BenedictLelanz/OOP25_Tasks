package main.generics.lecture;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // TODO random element

        int[] values = new int[] { 1,2,3,4};

        
        String[] values1 = new String[] { "hello", "world"};

        RandomList<String> rl = new RandomList<>(values1);
        String randomString = rl.getRandomElement();
        System.out.println(randomString);

        //print(values);

        foo(4);
    }

    class X {

    }

    class Y extends X {
        // weniger methods
    }

    class Z extends Y {
        // viele Methods
    }

    static void method1(List<? extends X> list) {
        list.add(new Y());
    }

    static <S> void foo(S s) {
        method1(new ArrayList<Y>());
    }

    static void stackExample() {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(7);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
    
}
