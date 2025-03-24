package main.abstraction.inheritance.lecture;

import java.util.List;

public class Vogle extends AbstractExample {

    final int alter;

    Vogle(int alter) {
        this.alter = alter;
    }

    List a;

    static String name;

    int i;

    void parentMethod1() {
        System.out.println("Parent mehtod 1");
        parentMethod2();
        i = 3;
    }

    void parentMethod2() {
        System.out.println("Parent mehtod 2");
        // VIel Logic, fast brauchbar
    }

    @Override
    void foo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'foo'");
    }

    @Override
    void foo1() {
        
    }
    
}
