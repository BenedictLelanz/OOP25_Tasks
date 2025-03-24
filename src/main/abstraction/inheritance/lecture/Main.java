package main.abstraction.inheritance.lecture;

public class Main {

    public static void main(String[] args) {

        new AbstractExample();

        Pinguin children = new Pinguin();

        //children.parentMethod2();

        //children.i;

        //System.out.println(children);

        Pinguin children2 = children;

        System.out.println(children == children2);
        System.out.println(children.equals(children2));

        new Pinguin(3);
        //children.childrenMethod1();
        children.parentMethod1();
        children.parentMethod2();
        
        // Geht das?
        //Children children = new Parent();
        
        // Geht das?
        //doSthWithParent(children);

        Vogle p = children;
        // Geht das?
        //Children cc = p;

        // ... expliziter Cast

        int a = 3;
        doSth(a);

    }

    private static void doSthWithParent(Vogle parent) {
        parent.parentMethod1();
    }

    private static void doSth(Integer a) {
        
    }
    
}
