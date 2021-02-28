package Week5F;

import java.util.Random;

/**
 * Big O Notation practice
 * Created by: Melissa Melaugh
 * Created on: 19/02/2021
 * Updated on: 19/02/2021
 * COM742:Week5F:Q3
 */
public class Q3 {
    private static Random rand = new Random();

    public static void main(String[] args) {
        int[][] someList = createList(100, 100);
        printMinMax(someList);
    }

    private static void printMinMax(int[][] anArray){
        int min = anArray[0][0]; //1
        int max = anArray[0][0]; //1

        for(int[] row : anArray){ // n
            for(int num : row){ // n*n => n^2
                if(num < min){ //n*n => n^2
                    min = num; //n*n => n^2
                }//end if min
                if(num > max){ //n*n => n^2
                    max = num; //n*n => n^2
                }//end if max
            }//end for num in row
        }// end for row in anArray

        System.out.println("Min: " + min); //1
        System.out.println("Max: " + max); //1
        //could be returned as an int array with defined positions, or a HashTable
        // 5n^2 + n + 4
        //O(N^2)
    }// end printMinMax

    private static int[][] createList(int row, int col){
        int[][] theList = new int[row][col]; //1
        for(int r = 0; r < row; r++){ //2n+1
            for(int c = 0; c < col; c++) { //n (2n+1) => 2n^2 + 1n
                theList[r][c] = rand.nextInt((row*col) * 100) + 1; //n(n) => n^2
            }//end for col
        }//end for row
        return theList;
        // 3n^2 + 3n + 2
    }//end createList
}
