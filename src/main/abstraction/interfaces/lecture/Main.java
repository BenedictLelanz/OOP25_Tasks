package main.abstraction.interfaces.lecture;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] values = new int[] {0,1,2};
        
        Function add5 = new Add5();

        int[] output =map(values, add5);
        for (int value : output)
            System.out.println(value);

        int i = FullInterface.VALUE;

        Person hans = new Person("Hans", 60);
        
    }

    private static int[] map(int[] input, Function f) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = f.execute(input[i]);
        }
        return output;
    }
    
}
