package main.abstraction.inheritance.tasks;

import java.awt.Graphics;
import java.util.Arrays;

public class Strecke extends GeometrischesObjekt {

    int x1,y1,x2,y2;

    Strecke(int x1, int y1, int x2, int y2) {
        super(Arrays.asList(new Punkt(x1,y1), new Punkt(x2,y2)));
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    void draw(Graphics g) {
        g.drawLine(this.x1, this.y1, this.x2, this.y2);
    }
    
}
