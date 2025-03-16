package main.abstraction.inheritance.tasks;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<GeometrischesObjekt> objs = new ArrayList<>();

        Dreieck d = new Dreieck(200,200,150);
        objs.add(d);

        new DrawableRenderer(objs);
    }

    
    
}
