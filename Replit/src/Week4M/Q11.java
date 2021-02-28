package Week4M;

import java.util.Random;

/**
 * Row and column addition
 * Created by: Melissa Melaugh
 * Created on: 08/02/2021
 * Updated on: 08/02/2021
 * COM742:Week4M:Q11
 */
public class Q11 {
    public static void main(String[] args) {

        Random ran = new Random(0); // Create random num generator object - seed=0
        int [][]a = new int[4][3]; //20 rows, 8 cols

        for(int r = 0; r < a.length; r++){
            for(int c = 0; c < a[0].length; c++){ // nested for loop to go over 2d array

                a[r][c] = ran.nextInt(10) + 1; // generate random num

                System.out.print(a[r][c] + "\t"); // tab between columns for print
            }
            System.out.println(""); // new line between rows for print
        }
        System.out.println("Row 1 sum = " + rowSum(a,1));
        System.out.println("Col 2 sum = " + colSum(a,2));
    }//end main

    public static int rowSum(int[][] a, int x)  {
        int total = 0;
        for(int i = 0; i < a[x].length; i++){
            total += a[x][i];
        }//end for i
        return total;
    }//end rowSum

    public static int colSum(int[][] a, int x) {
        int total = 0;
        for(int i = 0; i < a.length; i++){
            total += a[i][x];
        }//end for i
        return total;
    }//end colSum
}
