package main.abstraction.inheritance.lecture;

public class Spiral {

    public static void main(String[] args) {
        int width = 9; // Odd number
        int[][] matrix = spiral(width);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < width; y++) {
                System.out.print(String.format("%02d", matrix[x][y])+" ");
            }
            System.out.println();
        }
    }

    static int[][] spiral(int width) {
        int[][] matrix = new int[width][width];
        // Init center
        int posX = (width - 1) / 2;
        int posY = posX;
        matrix[posX][posY] = 1;
        // Directions: {1,0} -> {0,1} -> {-1,0} -> {0,-1} -> ...
        int[] shift = new int[] {1,0};
        // To be displayed in a matrix cell
        int index = 2;
        // Generate...
        for (int i = 0; i < width * width; i++) {
            // How many steps in one direction? 1 right, 1 bottom, 2 left, 2 top, 3 right...
            int stepSize = i / 2 + 1;
            for (int step = 0; step < stepSize; step++) {
                posX += shift[0];
                posY += shift[1];
                if (posX >= width || posY >= width) return matrix;
                matrix[posX][posY] = index++;
            }
            // Update direction
            shift[0] = (int) Math.cos((i+1) * Math.PI / 2);
            shift[1] = (int) Math.sin((i+1) * Math.PI / 2);
        }
        return null;
    }
    
}
