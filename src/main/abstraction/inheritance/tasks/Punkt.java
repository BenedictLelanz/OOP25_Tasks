package main.abstraction.inheritance.tasks;

import java.util.ArrayList;

public class Punkt extends GeometrischesObjekt {

    int x;
    int y;

    Punkt(int x, int y) {
        super(new ArrayList<>());
        this.x = x;
        this.y = y;
    }
    
}
