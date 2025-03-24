package main.abstraction.enums.tasks;

import java.util.List;
import java.util.Scanner;

public class DataReader {

    DataReader(List<DataAssignment> assignments) {
        Scanner scanner= new Scanner(System.in);
        int index = 0;
        while (true) {
            DataAssignment a = assignments.get(index);
            index = (index + 1) % assignments.size();
            System.out.println("Assignment for " + a.getID() + ":");
            String[] args = scanner.nextLine().split(";");
            if (args.length == 1 && args[0].startsWith("exit")) break;
            if (args.length < 2) continue;
            a.assign(args[0], args[1]);
            System.out.println("Successfully assigned [" + args[0] + ", " + args[1] + "] to " + a.getID());
            System.out.println();            
        }
        scanner.close();
    }
    
}
