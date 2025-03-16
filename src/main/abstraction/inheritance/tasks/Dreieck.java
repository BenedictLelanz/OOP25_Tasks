package main.abstraction.inheritance.tasks;

import java.util.Arrays;

public class Dreieck extends GeometrischesObjekt {

    Dreieck(int x, int y, int length) {
        super(Arrays.asList(new Punkt(x, y), new Punkt(x+length, y), new Punkt(x+length/2, y-length)));
    }
    
}
