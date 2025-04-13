package main.generics.lecture;

import java.util.ArrayList;
import java.util.List;

/**
 * Example for a generic stack (with push and pop operations)
 */
public class Stack <T> {

    private final List<T> elements = new ArrayList<>();

    public void push(T element) {
        this.elements.add(element);
    }

    public T pop() {
        if (isEmpty()) return null;
        T element = this.elements.get(this.elements.size() - 1);
        this.elements.remove(element);
        return element;
    }

    public T peek() {
        if (isEmpty()) return null;
        return this.elements.get(this.elements.size() - 1);
    }

    public boolean isEmpty() {
        return this.elements.size() == 0;
    }
    
}
