package main.exceptions.lecture;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Object o = null;
        // Unchecked exception
        // o.toString();

        try {
            otherMethod();
        } catch (IOException e) {
            System.out.println(e.getCause());
        }

    }

    static void otherMethod() throws IOException {
        try {
            throwWxception();
        } catch (MyException e) {
            throw new IOException(e);
        }
    }

    static void throwWxception() throws MyException {
        // user input is not a number
        throw new MyException();
    }

}
