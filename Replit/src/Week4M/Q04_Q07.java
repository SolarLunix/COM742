package Week4M;

import java.util.Random;

/**
 * Initialise and manipulate a 2D array
 * Created by: Melissa Melaugh
 * Created on: 08/02/2021
 * Updated on: 08/02/2021
 * COM742:Week4M:Q04_Q07
 */
public class Q04_Q07 {
    public static void main(String[] args) {
        int[][] intValues = fill2Dint(5, 2);
        double[][] doubleValues = new double[10][15];
        String[][] stringValues = new String[3][10];

        print2D(intValues);
        System.out.println("The value at 3, 1: " + getValueAt(intValues, 3, 1));
        setValueAt(intValues, 3, 1, 0);
        System.out.println("The new value at 3, 1: " + getValueAt(intValues, 3, 1));
    }

    private static int[][] fill2Dint(int rows, int cols){
        Random rnd = new Random();
        int[][] values = new int[rows][cols];

        for(int i = 0; i < rows; i ++){
            for(int j = 0; j < cols; j++){
                values[i][j] = rnd.nextInt(10);
            }//end for j cols
        }//end for i rows

        return values;
    }//end fill 2D int

    public static void print2D(int[][] a){
        for(int[] row : a){
            for(int item : row){
                System.out.print(String.format("%d ", item));
            }//end for item in row
            System.out.println();
        }//end for row in a
    }//end print2D

    public static int getValueAt(int[][] a, int row, int col){
        return a[row][col];
    }//end getValueAt

    public static void setValueAt(int[][] a, int row, int col, int value){
        a[row][col] = value;
    }//end setValueAt
}
