package main.abstraction.interfaces.lecture;

import java.io.Serializable;

public class Person implements Serializable {
    String name;
    int age;

    public Person(String name, int alter) {
        this.name = name;
        this.age = alter;
    }

    public int getAge() {
        return age;
    }

    public void birthday() {
        age++;
    }

    void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person[name: " + getName() + ", age: " + getAge() + "]";
    }
}
