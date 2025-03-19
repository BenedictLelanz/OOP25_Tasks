package main.abstraction.inheritance.tasks;

import java.awt.*;
import java.util.List;
import javax.swing.*;

public class DrawableRenderer extends JPanel {

    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    private final List<GeometrischesObjekt> drawables;

    public DrawableRenderer(List<GeometrischesObjekt> drawables) {
        JFrame frame = new JFrame("Drawable Renderer");
        this.drawables = drawables;
        
        frame.add(this);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (GeometrischesObjekt o : this.drawables) {
            g.setColor(Color.BLACK);
            o.draw(g);
        }
    }

}