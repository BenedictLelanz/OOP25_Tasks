package main.exceptions.lecture;
public class Main {

    public static void main(String[] args) {
        Object o = null;
        // Unchecked exception
        o.toString();
        
        IllegalArgumentException e = new IllegalArgumentException();
        //throw new IllegalArgumentException(e);
    }
    
}
