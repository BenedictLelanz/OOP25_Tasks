package main.abstraction.interfaces.lecture;

import java.util.function.IntPredicate;

public class IntFilter {

    int[] filter(int[] values, IntPredicate p) {
        int[] filtered = new int[values.length];
        int index = 0;
        for (int value : values) {
            if (p.test(value)) {
                filtered[index] = value;
                index++;
            }
        }
        int[] filteredTrim = new int[index];
        for (int i = 0; i < index; i++)
            filteredTrim[i] = filtered[i];
        return filteredTrim;
    }
    
}
