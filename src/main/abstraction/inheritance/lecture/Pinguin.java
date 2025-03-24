package main.abstraction.inheritance.lecture;

import java.util.List;

public class Pinguin extends Vogle {

    List b;

    static String name;

    int i;

    Pinguin() {
        super("hello");
        System.out.println("hallo");
    }

    Pinguin(int i) {
        this();
    }

    void childrenMethod1() {
        System.out.println("Children method 1");
        i = 3;
        super.i = 5;
    }

    @Override
    void parentMethod2() {
        System.out.println("Overridden parent mehtod 2");
        super.parentMethod2();
    }

    @Override
    public String toString() {
        String superString = super.toString();
        return "children" + i + " " + superString;
    }

    @Override
    public boolean equals(Object o) {
        boolean isI = o instanceof Pinguin c;
        Pinguin c1 = (Pinguin) o;
        if (isI) return this.i == c1.i;
        return false;
    }
    

}
