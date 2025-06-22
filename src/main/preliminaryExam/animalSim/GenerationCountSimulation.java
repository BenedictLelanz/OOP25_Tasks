package main.preliminaryExam.animalSim;

import java.util.HashMap;
import java.util.Map;

import java.awt.*;
import javax.swing.*;

public class GenerationCountSimulation<T extends Animal> extends JPanel implements LifeListener<T> {

    private static final int MAX_BARS = 20;

    private Map<Integer, Integer> population = new HashMap<>();

    @Override
    public synchronized void born(int generation) {
        this.population.put(generation, 1 + this.population.getOrDefault(generation, 0));
        repaint();
    }

    @Override
    public synchronized void died(int generation) {
        int newCount = this.population.get(generation) - 1;
        if (newCount < 0) throw new IllegalStateException("count for generation " + generation + " is less than zero.");
        this.population.put(generation, newCount);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();

        int padding = 50;
        int barWidth = (width - 2 * padding) / MAX_BARS;

        int maxVal = population.values().stream().max(Integer::compareTo).orElse(1);

        int i = 0;
        for (Map.Entry<Integer, Integer> entry : population.entrySet()) {
            int x = padding + i * barWidth;
            int barHeight = (int) ((double) entry.getValue() / maxVal * (height - 2 * padding));
            int y = height - padding - barHeight;

            g.setColor(Color.BLUE);
            g.fillRect(x, y, barWidth - 10, barHeight);

            g.setColor(Color.BLACK);
            g.drawString(String.valueOf(entry.getKey()), x + (barWidth - 10) / 2 - 5, height - 30);

            g.drawString(String.valueOf(entry.getValue()), x + (barWidth - 10) / 2 - 5, y - 5);

            i++;
        }

        g.drawLine(padding, height - padding, width - padding, height - padding);
        g.drawLine(padding, padding, padding, height - padding);
    }

}
