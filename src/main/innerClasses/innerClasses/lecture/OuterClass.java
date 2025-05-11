package main.innerClasses.innerClasses.lecture;

public class OuterClass {

    public static void main(String[] args) {

        // Geht nicht, da eine innere Klasse immer eine Instanz der äußeren benötigt
        new InnerClass();

        // Beipsiel:
        OuterClass oc = new OuterClass();
        oc.new InnerClass();
    }

    OuterClass() {
        // InnerClass wird aus nicht-statischem Kontext DERSELBEN Klasse erzeugt -> funktioniert
        new InnerClass();
    }
    
    int var = 5;

    class InnerClass {

        int var = 7;

        void innerMethod() {
            // Zugriff auf Elemente der äußeren Klasse
            OuterClass.this.var = 6;

            // Wie geife ich auf var zu, wenn es auch int var in der inneren Klasse gibt?!
        }

        private static void staticMethod() {
            // Diese Methode ist immer aus der äußeren Klasse afrufbar
        }

    }

    void outerMehtod() {
        // Geht nicht, wir brauchen natürlich eine Instanz
        innerMethod();
        
        // Wir können aber die statische Methode aufrufen
        OuterClass.InnerClass.staticMethod();



    }

    protected class MyPrivateClass {

        public void foo() {
            // Auch hier kein Zugriff auf foo, trotz public
        }

    }

    MyPrivateClass getMyPrivateClass() {
        // Damit könen wir versuchen, von außen zuzugreifen...
        return new MyPrivateClass();
    }

    static class StaticInnerClass {
        // Völlig unabhängig, wie andere Klasse
    }
    
}
