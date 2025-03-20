package main.abstraction.inheritance.tasks;

import java.awt.Graphics;
import java.util.List;

public class GeometrischesObjekt {

    final List<Punkt> punkte;

    GeometrischesObjekt(List<Punkt> punkte) {
        this.punkte = punkte;
    } 

    void draw(Graphics g) {
        int[] xPoints = punkte.stream().mapToInt(p -> p.x).toArray();
        int[] yPoints = punkte.stream().mapToInt(p -> p.y).toArray();
        g.fillPolygon(xPoints, yPoints, punkte.size());
    }

    @Override
    public String toString() {
        return "GeometrischesObjekt[" + this.punkte + "]";
    }
    
}
