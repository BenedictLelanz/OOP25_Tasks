package main.abstraction.interfaces.lecture;

public interface FullInterface {

    public static final int VALUE = 5;
    // Geht auch, "unter der Haube" aber immer public static final
    int OTHER_VALUE = 3;

    public default void foo() {
        // Do code a
    }
    
}
