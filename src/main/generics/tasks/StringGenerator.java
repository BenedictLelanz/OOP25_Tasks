package main.generics.tasks;

import java.util.HashSet;
import java.util.Set;

public class StringGenerator implements TestDataGenerator<String> {

    private static final String LETTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    @Override
    public Set<String> generate(int amount) {
        Set<String> strings = new HashSet<>();
        for (int i = 0; i < amount; i++) {
            int length = 5 + (int) (Math.random() * 5);
            StringBuilder sb = new StringBuilder(length);
            for (int k = 0; k < length; k++)
                sb.append(LETTERS.charAt((int) (Math.random() * LETTERS.length())));
            strings.add(sb.toString());
        }
        return strings;
    }
    
}
