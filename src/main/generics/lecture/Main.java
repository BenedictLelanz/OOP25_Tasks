package main.generics.lecture;

public class Main {

    public static void main(String[] args) {
        // TODO random element
    }

    static void stackExample() {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(7);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
    
}
