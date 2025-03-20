package main.abstraction.inheritance.tasks;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<GeometrischesObjekt> objs = new ArrayList<>();

        Dreieck d = new Dreieck(200,200,150,Color.BLUE);
        System.out.println("Fläche Dreieck: " + d.getArea());
        objs.add(d);

        Strecke s = new Strecke(400,400,500,500);
        objs.add(s);

        Punkt p = new Punkt(700,100);
        objs.add(p);

        Viereck v = new Viereck(300,250,50,50);
        objs.add(v);

        System.out.println("Fläche Viereck: " + v.getArea());

        new DrawableRenderer(objs);
    }

    
    
}
