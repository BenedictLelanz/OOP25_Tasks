package main.abstraction.inheritance.lecture;

public class Parent {

    static String name;

    int i;

    Parent(String name) {

    }

    void parentMethod1() {
        System.out.println("Parent mehtod 1");
        parentMethod2();
        i = 3;
    }

    void parentMethod2() {
        System.out.println("Parent mehtod 2");
        // VIel Logic, fast brauchbar
    }
    
}
