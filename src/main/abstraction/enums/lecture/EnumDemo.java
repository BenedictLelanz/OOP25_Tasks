package main.abstraction.enums.lecture;

public class EnumDemo {

    enum Values {

        // Steht immer ganz oben, konstruiert 3 Instanzen der 'Klasse' (des Enums) Values
        VALUE1, VALUE2, VALUE3;

        Values() {
            // ...

            // Name, z.B. VALUE2
            this.name();

            // Id (0 oder 1 oder 2...)
            this.ordinal();

            // Array über alle Values
            Values.values();

            // VALUE2 Instanz
            Values.valueOf("VALUE2");
        }

    }
    
}
