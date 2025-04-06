package main.exceptions.lecture.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadWrite {

    public static void main(String[] args) throws IOException {
        test1();
    }

    static void testConsole() throws IOException {
        // Zum Einlesen von Strings von Strings von der Konsole:
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Gib deinen Namen ein: ");
        String name = reader.readLine();
        System.out.println("Hallo, " + name + "!");

        // Einfacher zu bedienen, weniger performant (siehe enum-Übung)
        Scanner s = new Scanner(System.in);
    }

    static void test1() throws IOException {
        // Zum Einlesen von Strings von Strings von der Konsole:
        BufferedReader readerFile = new BufferedReader(new FileReader("res/test.txt"));
        String readLineFile1 = readerFile.readLine();
        String readLineFile2 = readerFile.readLine();
        System.out.println(readLineFile1 + " " + readLineFile2);
        readerFile.close();
    }

}
