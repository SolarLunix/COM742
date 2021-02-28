package Week5F;

import java.util.Arrays;
import java.util.Random;

/**
 * Algorithm Complexity
 * Created by: Melissa Melaugh
 * Created on: 19/02/2021
 * Updated on: 19/02/2021
 * COM742:Week5F:Q1Q2
 */
public class Q1Q2 {
    private static Random rand = new Random();

    public static void main(String[] args) {
        int[] someList = createList(100);
        printMinMax(someList);
        printMinMaxSort(someList);
    }

    private static void printMinMax(int[] anArray){
        int min = anArray[0]; //1
        int max = anArray[0]; //1

        for(int i = 1; i < anArray.length; i++){ // 2n + 1
            if(anArray[i] < min){ //n
                min = anArray[i]; //n
            }//end if min

            if(anArray[i] > max){ //n
                max = anArray[i]; //n
            }//end if max
        }// end for i

        System.out.println("Min: " + min); //1
        System.out.println("Max: " + max); //1
        //could be returned as an int array with defined positions, or a HashTable
        //6n + 5
        //O(N)
    }// end printMinMax

    private static void printMinMaxSort(int[] anArray){
        Arrays.sort(anArray); // O(n log(n))
        System.out.println("Min: " + anArray[0]); //1
        System.out.println("Max: " + anArray[anArray.length-1]); //1
        // (N log(N)) + 2
        // O(N log(N))
    }

    private static int[] createList(int length){
        int[] theList = new int[length]; //1
        for(int index = 0; index < length; index++){ //2n + 1
            theList[index] = rand.nextInt(length*100) + 1; //n
        }//end for index
        return theList;
        //3n+2
    }//end createList
}
