package main.exceptions.tasks;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import main.abstraction.interfaces.lecture.Person;

public class PersonCreator {

    public static void main(String[] args) {
        writePerson("Hans", 20);
        writePerson("Peter", 40);
        writePerson("Georg", 66);
        writePerson("Sebastian", 12);
        writePerson("Hannes", 17);
        writePerson("Karl", 80);
    }

    private static void writePerson(String name, int age) {
        // Folder persons exists
        Person person = new Person(name, age);
        try {
            ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream("res/persons/" + name + ".person"));
            s.writeObject(person);
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
