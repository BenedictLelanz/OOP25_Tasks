package main.abstraction.inheritance.lecture;

public class Main {

    public static void main(String[] args) {

    
        Children children = new Children();

        //children.parentMethod2();

        //children.i;

        //System.out.println(children);

        Children children2 = children;

        System.out.println(children == children2);
        System.out.println(children.equals(children2));

        new Children(3);
        //children.childrenMethod1();
        children.parentMethod1();
        //children.parentMethod2();
        
        // Geht das?
       // Children children = new Parent();
        
        // Geht das?
        doSthWithParent(children);

        Parent p = children;
        // Geht das?
        Children cc = (Children) p;

        //Parent parent = new Parent();
        
        //Children c = (Children) parent;

        // ... expliziter Cast

    }

    private static void doSthWithParent(Parent parent) {
        parent.parentMethod1();
    }
    
}
