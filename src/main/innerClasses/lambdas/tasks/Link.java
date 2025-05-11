package main.innerClasses.lambdas.tasks;

public interface Link<T> {

    /**
     * Links two elements to each other.
     * @param a
     * @param b
     * @return
     */
    T link(T a, T b);
    
}
