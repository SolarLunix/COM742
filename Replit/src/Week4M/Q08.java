package Week4M;

import java.util.Random;

/**
 * Complete the sum method
 * Created by: Melissa Melaugh
 * Created on: 08/02/2021
 * Updated on: 08/02/2021
 * COM742:Week4M:Q08
 */
public class Q08 {
    public static void main(String[] args) {

        Random ran = new Random(0); // Random num generator obj - seed=0
        int [][]a = new int[20][8]; // 20 rows, 8 cols

        for(int r = 0; r < a.length; r++){
            for(int c = 0; c < a[0].length; c++){
                a[r][c] = ran.nextInt(1000) + 1; // generate random num
            }//end for c
        } //end for r

        System.out.println(sum2DArray(a));

    } //public

    public static int sum2DArray(int[][] a) {
        int total = 0;
        for(int[] row : a){
            for(int num : row){
                total += num;
            }// end for num in row
        }//end for row in a
        return total;
    }//ends sum2DArray
}
