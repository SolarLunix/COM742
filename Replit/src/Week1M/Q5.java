package Week1M;

/**
 * Develop methods for the TestArray method
 * Created by: Melissa Melaugh
 * Created on: 18/01/2021
 * Updated on: 18/01/2021
 * COM742:Week1M:Q5
 */
public class Q5 {
    public static void main(String[] args) {
        int[] testArray = fillArray(20);
        printArray(testArray);
        calculateAverage(testArray);
    }

    public static int[] fillArray(int length){
        final int MULTIPLE = 10;

        int[] newArray = new int[length];
        for(int i = 0; i < length; i++){
            newArray[i] = i * MULTIPLE;
        }

        return newArray;
    }

    public static void printArray(int[] anArray){
        for(int i = 0; i < anArray.length; i++){
            System.out.println(String.format("List[%d] = %d", i, anArray[i]));
        }
    }

    public static void calculateAverage(int[] anArray){
        int total = 0;
        for(int num : anArray){
            total += num;
        }
        System.out.println(String.format("The average for this array is %.2f", ((double)total/ anArray.length)));
    }
}
