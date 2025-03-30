package main.documentation.lecture.pack;

import main.documentation.lecture.Sichtbarkeit;

public class PackClass extends Sichtbarkeit {

    PackClass() {
        Sichtbarkeit s = new Sichtbarkeit();
        //s.protectedInt = 7;
        super.protectedInt = 3;
        super.mehtod1();
    }
    
}
