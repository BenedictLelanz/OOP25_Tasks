package main.innerClasses.innerClasses.lecture;

public class Test {

    public static void main(String[] args) {
        new Test();
    }

    Test() {
        X x = new X(2);
        X.Y xy = new X.Y(1.0);
        X.Z xz = x.new Z("abc");
        foo(new A() {

            public void m() {

            }

        });
    }

    void foo(A a) {

    }
    
}

class X {

    X(int i) {

    }

    static class Y {

        Y(double k) {

        }

    }

    class Z {

        Z(String i) {

        }

    }
    
}

interface A {
}
