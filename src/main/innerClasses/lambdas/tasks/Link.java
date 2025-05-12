package main.innerClasses.lambdas.tasks;

public interface Link<T> {

    /**
     * Links two elements resulting in a new element.
     * 
     * Example usage: (a, b) -> a + b
     * 
     * @param a
     * @param b
     * @return the result of linking
     */
    T link(T a, T b);
    
}
