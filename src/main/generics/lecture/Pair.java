package main.generics.lecture;

public class Pair <T, S extends UpperBound & Comparable<S> > {

    private final T firstElement;
    private final S secondElement;

    Pair(T first, S second) {
        this.firstElement = first;
        this.secondElement = second;
        second.myMethod();
    }

    Pair<S, T> getInverse() {
        return new Pair<>(this.secondElement, this.firstElement);
    }
    
}

class UpperBound {
    void myMethod() {

    }
}
