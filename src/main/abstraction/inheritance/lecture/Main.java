package main.abstraction.inheritance.lecture;

public class Main {

    public static void main(String[] args) {

        Children children = new Children();
        children.childrenMethod1();
        children.parentMethod1();
        children.parentMethod2();
        
        // Geht das?
        //Children children = new Parent();
        
        // Geht das?
        //doSthWithParent(children);

        Parent p = children;
        // Geht das?
        //Children cc = p;

        // ... expliziter Cast

    }

    private static void doSthWithParent(Parent parent) {
        parent.parentMethod1();
    }
    
}
