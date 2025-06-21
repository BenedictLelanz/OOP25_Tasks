package main.innerClasses.innerClasses.lecture;

import java.util.function.Function;

public class LocalInnerClass {

    public static void main(String[] args) {

    }

    int inc5(int i) {

        final int k = 1;
        

        //k++;

        class Tranform implements Function<Integer, Integer> {

            @Override
            public Integer apply(Integer t) {
                return t + 5;
            }

            void manipulate() {

                class Crazy {}
                // Achtung! Sowas geht nicht.
                System.out.println(i);
                // Eine Methodenvariable existiert nur während einer Methode
                // Die Instanz existiert möglicherweise länger

                // Scheint auf den ersten Blick zu gehen (effective final)
                // Was passiert, wenn ich igendwo anders k manipuliere?
                System.out.println(k);

                // Schlussfolgerung: Lkale Variablen müssen final oder effektiv-final sein
                
            }
        }

        Tranform t = new Tranform();
        return t.apply(i);
    }
    
}
