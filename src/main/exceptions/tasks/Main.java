package main.exceptions.tasks;

import java.util.Map;

import main.abstraction.enums.tasks.StudiengangImpl;
import main.abstraction.interfaces.lecture.Person;

public class Main {
    
    public static void main(String[] args) {        
        for (StudiengangImpl matrikel : StudiengangImpl.values()) {
            System.out.println("Students for " + matrikel);
            // Print all students
            Map<String, Person> students = matrikel.getStudents();
            System.out.println(students);
            System.out.println();
        }
    }

}
