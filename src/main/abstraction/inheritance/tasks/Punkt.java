package main.abstraction.inheritance.tasks;

import java.awt.Graphics;
import java.util.ArrayList;

public class Punkt extends GeometrischesObjekt {

    int x;
    int y;

    Punkt(int x, int y) {
        super(new ArrayList<>());
        this.x = x;
        this.y = y;
    }

    @Override
    void draw(Graphics g) {
        g.fillArc(x, y, 10, 10, 0, 360);
    }

    @Override
    public String toString() {
        return "Punkt[" + this.x + ", " + this.y + "]";
    }
    
}
