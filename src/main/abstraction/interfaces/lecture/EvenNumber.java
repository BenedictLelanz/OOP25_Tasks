package main.abstraction.interfaces.lecture;

import java.util.function.IntPredicate;

public class EvenNumber implements IntPredicate {

    @Override
    public boolean test(int value) {
        return value % 2 == 0;
    }
    
}
