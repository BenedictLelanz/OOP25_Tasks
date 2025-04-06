package main.exceptions.lecture.io;

import java.io.*;

public class CopyBytes {

    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("res/Eingabe.dat");
        FileOutputStream out = new FileOutputStream("res/Ausgabe.dat");
        int c;
        do {
            c = in.read();
            out.write(c);
        } while (c != -1);
        in.close();
        out.close();
    }

}
