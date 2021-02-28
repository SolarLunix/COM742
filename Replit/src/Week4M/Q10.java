package Week4M;

import java.util.Random;

/**
 * find the minimum and maximum in an array
 * Created by: Melissa Melaugh
 * Created on: 08/02/2021
 * Updated on: 08/02/2021
 * COM742:Week4M:Q10
 */
public class Q10 {
    public static void main(String[] args) {

        Random ran = new Random(0); // Create random num generator object - seed=0
        int [][]a = new int[20][8]; //20 rows, 8 cols

        for(int r = 0; r < a.length; r++){
            for(int c = 0; c < a[0].length; c++){ // nested for loop to go over 2d array

                a[r][c] = ran.nextInt(1000) + 1; // generate random num

                System.out.print(a[r][c] + "\t"); // tab between columns for print
            }
            System.out.println(""); // new line between rows for print
        }
        System.out.println("Array max = " + array2DMax(a));
        System.out.println("Array min = " + array2DMin(a));
    }//end main

    public static int array2DMax(int[][] a) {
        int max = a[0][0];
        for(int[] row : a){
            for(int num : row){
                if(num > max){
                    max = num;
                }//end if
            }// end for num in row
        }//end for row in a
        return max;
    }//end array2DMax

    public static int array2DMin(int[][] a) {
        int min = a[0][0];
        for(int[] row : a){
            for(int num : row){
                if(num < min){
                    min = num;
                }//end if
            }// end for num in row
        }//end for row in a
        return min;
    }//end array2DMin
}
