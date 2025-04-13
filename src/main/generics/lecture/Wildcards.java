package main.generics.lecture;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wildcards {

    /**
     * NUR LESEN ERLAUBT: bei reiner Wildcard, also ?
     * Aber auch bei ? extends MyClass (rein ? ist schließlich dasselbe wie ? extends Object)
     * Wir wissen nicht, was es ist.
     */

    Map<?,?> map = new HashMap<>();

    void covarianz() {
        // Geht nicht! Nur Lesen erlaubt.
        map.put("aaa", "b");
        map.put(new Object(), new Object());

        // Das geht -> Integer und Double sind mit ? verträglich (? : irgendein Typ)
        map = new HashMap<Integer, Double>(); 
        // Die Gestalt von Integer, Double wird angenommen -> obige Befehle wären also nicht gegangen!

        // Hier kann ich wieder schreiben! Aber ich kann nicht in die inneren Listen schreiben
        List<List<?>> lists = new ArrayList<>();
        lists.add(new ArrayList<Integer>());

        List<?> firstList = lists.get(0);
        // Geht nicht, welche Gestalt hat denn firstList?!
        firstList.add("hello world");
        // Casting würde eine ClassCastException werfen (wir hatten eine Integer Liste definiert)
        List<String> firstStringList = (List<String>) lists.get(0);
    }

    void contravarianz() {
        List<? super Integer> vals = new ArrayList<>();
        // Nur ints oder Childrenklassen von Integers möglich 
        vals.add(3);
        // Denn: Was, wenn es wirklich eine List<Integer> ist? Values vom Typ höher als Integer hätten
        // nicht alle geforderten Methoden/Attribute

        // Hier ist also Lesen und Schreiben möglich
    }
    
}
