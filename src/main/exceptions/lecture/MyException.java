package main.exceptions.lecture;

public class MyException extends RuntimeException {

    MyException() {
        super("Hier ist ein Fehler!");
    }
}
