package main.innerClasses.innerClasses.lecture;

//import main.innerClasses.innerClasses.lecture.OuterClass.MyPrivateClass;

public class AccessToPrivaeClass {

    AccessToPrivaeClass() {

        OuterClass oc = new OuterClass();

        // Geht nicht, der Typ ist nicht sichtbar
        oc.getMyPrivateClass().foo();
    }
    
}
