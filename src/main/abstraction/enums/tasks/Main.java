package main.abstraction.enums.tasks;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<DataAssignment> assignments = new ArrayList<>();

        for (StudiengangImpl h : StudiengangImpl.values())
            assignments.add(h);

        // Reads all the data from the console
        new DataReader(assignments);

        for (StudiengangImpl h : StudiengangImpl.values())
            System.out.println(h);
    }
    
    static double getAuslastung(StudiengangImpl h) {
        return (double) h.getStudierende() / h.getStudienplaetzte();
    }

}
