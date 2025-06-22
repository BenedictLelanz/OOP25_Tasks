package main.preliminaryExam.animalSim;

import java.io.File;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        Enviroment env = new File(Enviroment.FILE_NAME).exists() ? new Enviroment(Enviroment.FILE_NAME)
                : new Enviroment();

        GenerationCountSimulation<Velandrakon> sim = new GenerationCountSimulation<>();

        // Create velandrakons
        for (int age = 1; age <= 20; age++)
            for (int count = 0; count < 10; count++)
                new Velandrakon(env, age, 0, sim);

        // Show frame
        JFrame frame = new JFrame("Population");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(800, 500);
        frame.add(sim);
        frame.setVisible(true);
    }

}
