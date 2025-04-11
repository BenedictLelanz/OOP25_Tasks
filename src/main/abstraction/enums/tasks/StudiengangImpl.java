package main.abstraction.enums.tasks;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

import main.abstraction.interfaces.lecture.Person;

public enum StudiengangImpl implements Studiengang, DataAssignment {

    IIb(25, 30), IIm(9, 15), IWb(12, 20), AIb(18, 25), DSb(15, 20);

    private Map<String, String> data = new HashMap<>();

    private Map<String, Person> students = new HashMap<>();

    private int studierende;
    private int studienplaetze;

    StudiengangImpl(int studierende, int studienplaetze) {
        this.studierende = studierende;
        this.studienplaetze = studienplaetze;
        try {
            readPersons();            
        } catch (IOException e) {
            // General io exception occured
            e.printStackTrace();
        }
    }

    private void readPersons() throws IOException {
        // Define it out of the try catch scope to be able to close it inside the
        // finally
        BufferedReader reader = null;
        String fileName = "res/matrikel/" + name() + ".txt";
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String readPath = null;
            // Step through the while loop as long as there is a path != null
            while ((readPath = reader.readLine()) != null) {
                // New input stream for each path
                ObjectInputStream in = null;
                try {
                    in = new ObjectInputStream(new FileInputStream(readPath));
                    Person person = (Person) in.readObject();
                    // Add person to the person map
                    students.put(person.getName(), person);
                } catch (ClassNotFoundException e) {
                    // Catched when the class 'Person' does not exist
                    e.printStackTrace();
                } finally {
                    // Imporant! Close stream
                    in.close();
                }

            }
        } catch (FileNotFoundException e) {
            // Catched when the readPath variable contains a path where no file exists
            System.out.println(fileName + " does not exist.");
        } finally {
            // Imporant! Close stream
            if (reader != null) reader.close();
        }
    }

    public Map<String, Person> getStudents() {
        return this.students;
    }

    @Override
    public String getBezeichner() {
        return name();
    }

    @Override
    public int getStudienplaetzte() {
        return this.studienplaetze;
    }

    @Override
    public int getStudierende() {
        return this.studierende;
    }

    @Override
    public String getID() {
        return name();
    }

    @Override
    public void assign(String key, String value) {
        this.data.put(key, value);
    }

    @Override
    public String toString() {
        return "Studiengang[" + name() + ", studienplätze: " + getStudienplaetzte() +
                ", studierende: " + getStudierende() + ", props: " + this.data + 
                ", studies: " + this.students + "]";
    }

}
