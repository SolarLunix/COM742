package Week4M;

/**
 * Write a program to print out a 2D grid
 * Created by: Melissa Melaugh
 * Created on: 08/02/2021
 * Updated on: 08/02/2021
 * COM742:Week4M:Q01
 */
public class Q01 {
    public static void main(String[] args) {
        printGrid(10, 10, "-");
    }

    private static void printGrid(int rows, int columns, String item){
        for(int row = 0; row < rows; row++){
            for(int column = 0; column < columns; column++){
                System.out.print(String.format("%s ", item));
            }//end for column
            System.out.println("\n");
        }//end for rows
    }
}
