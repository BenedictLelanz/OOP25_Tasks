package main.abstraction.inheritance.tasks;

import java.awt.Color;
import java.util.List;

public class Mehreck extends GeometrischesObjekt {

    Mehreck(List<Punkt> punkte) {
        super(punkte);
    }
    
    double getArea() {
        double sum = 0;
        List<Punkt> p = this.punkte;
        for (int i = 0; i < p.size(); i++) {
            int ip1 = (i+1) % p.size();
            sum += (p.get(i).y + p.get(ip1).y) * (p.get(i).x - p.get(ip1).x) / 2;
        }
        return Math.abs(sum);
    }
    
}
