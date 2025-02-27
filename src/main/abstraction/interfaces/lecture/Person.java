package main.abstraction.interfaces.lecture;

public class Person {
    String name;
    int age;

    Person(String name, int alter) {
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
}
