package main.abstraction.inheritance.tasks;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Arrays;

public class Dreieck extends Mehreck {

    Dreieck(int x, int y, int length, Color color) {
        super(Arrays.asList(new Punkt(x, y), new Punkt(x+length/2, y+length), new Punkt(x+length, y)));
    }

    @Override
    void draw(Graphics g) {
        g.setColor(Color.RED);
        super.draw(g);
    }

}
