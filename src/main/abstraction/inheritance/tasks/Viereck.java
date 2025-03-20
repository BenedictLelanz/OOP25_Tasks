package main.abstraction.inheritance.tasks;

import java.util.Arrays;

public class Viereck extends Mehreck {

    Viereck(int x, int y, int w, int h) {
        super(Arrays.asList(new Punkt(x,y), new Punkt(x+w,y), new Punkt(x+w,y+h), new Punkt(x,y+h)));
    }
    
}
