package main.innerClasses.innerClasses.lecture;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Anonym {

    public static void main(String[] args) {
        
        Anonym a = new Anonym();
        List<String> values = Arrays.asList("Hans", "Peter", "Georg");

        // Wir erstellen keine Klasse "StringComparator" -> direkt anonym
        a.sort(values, new Comparator<String>() {
            
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
            
        });

        System.out.println(values);

    }

    void sort(List<String> values, Comparator<String> c) {
        // Some sort logic...
        Collections.sort(values, c);
    }
    
}
