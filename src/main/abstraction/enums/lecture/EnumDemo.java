package main.abstraction.enums.lecture;

public class EnumDemo {

    interface I {
        String method1();
    }

    enum Values implements I {

        // Steht immer ganz oben, konstruiert 3 Instanzen der 'Klasse' (des Enums) Values
        VALUE1, VALUE2, VALUE3;

        @Override
        public String method1() {
            System.out.println("Run method 1, my name is " + name());
            return "hello world";
        }

    }

    static void doI(I i) {
        i.method1();
    }

    public static void main(String[] args) {
        // Wirft exception
        //Values v = Values.valueOf("VALUE");
        //System.out.println(v.ordinal());

        doI(Values.VALUE1);
        doI(Values.VALUE3);

    }
    
}
