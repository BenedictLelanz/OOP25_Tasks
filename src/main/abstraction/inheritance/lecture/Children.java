package main.abstraction.inheritance.lecture;

public class Children extends Parent {

    static String name;

    int i;

    Children() {
        super("hallo");
        System.out.println("hallo");
    }

    Children(int i) {
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
        boolean isI = o instanceof Children c;
        Children c1 = (Children) o;
        if (isI) return this.i == c1.i;
        return false;
    }
    

}
