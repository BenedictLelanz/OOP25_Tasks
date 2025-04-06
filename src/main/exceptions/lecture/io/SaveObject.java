package main.exceptions.lecture.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class SaveObject {
    
    public static void main(String[] args) throws Exception {
        // Write file
        ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream("res/audi.car"));
        s.writeObject(new Car("audi_80"));

        // Read file
        ObjectInputStream inS = new ObjectInputStream(new FileInputStream("res/audi.car"));
        Car car = (Car) inS.readObject();

        System.out.println(car.getName() + " " + car.getDate());
        car.drive();
    }

}

class Car implements Serializable {

    private final String name;

    private final Date dateOfConstruction;

    Car(String name) {
        this.name = name;
        this.dateOfConstruction = new Date();
    }

    String getName() {
        return this.name;
    }

    Date getDate() {
        return this.dateOfConstruction;
    }

    void drive() {
        System.out.println("driving started...");
    }

}
