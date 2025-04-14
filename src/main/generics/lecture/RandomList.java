package main.generics.lecture;

public class RandomList <T> {

    private final T[] elements;
    
    RandomList(T[] elements) {
        this.elements = elements;
    }

    T getRandomElement() {
        return this.elements[(int) (Math.random() * this.elements.length)];
    }
    
}
