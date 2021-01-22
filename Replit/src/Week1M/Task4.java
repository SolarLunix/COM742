package Week1M;

/**
 * Follow the instructions on slide 36
 * Created by: Melissa Melaugh
 * Created on: 18/01/2021
 * Updated on: 18/01/2021
 * COM742:Week1M:Task4
 */
public class Task4 { //Main {
    public static void main(String[] args) {
        // Declare and create an array capable of storing 10 character (char) values
        char[] charArray = new char[10];

        // Using an appropriate initialiser list, declare and populate an array with the following decimal numbers:
        // 3.3,  9.0,  45.0,  6.5,  7.9
        double[] doubleArray = {3.3,  9.0,  45.0,  6.5,  7.9};
        //Print out the values in the array
        printDoubleArray(doubleArray);

        // Modify the code multiple the values in the array by 2
        doubleArray = arrayTimes(doubleArray, 2);
        //Print out the values in the array
        printDoubleArray(doubleArray);

        // Modify the following code so that the order of the output numbers will be reversed
        doubleArray = reverseOrder(doubleArray);
        //Print out the values in the array
        printDoubleArray(doubleArray);
    }

    /**
     * This method reverses the order of an array and returns it.
     * @param dArray the array to be reversed
     * @return double[] the reversed array
     */
    private static double[] reverseOrder(double[] dArray){
        // Create a new array of the same length
        int len = dArray.length;
        double[] newArray = new double[len];

        for(int i = 0; i < dArray.length; i++){
            int n = len - (i + 1); // Find the new index for the value
            newArray[n] = dArray[i]; // Place the value from the original array into its new position
        }

        return newArray;
    }

    /**
     *  Multiply everything in a given array by a given int
     * @param dArray the array you wish to multiply by a given factor
     * @param times the factor you wish to multiply the array by
     * @return double[] the output of dArray with each index multiplied by times
     */
    private static double[] arrayTimes(double[] dArray, int times){
        for(int i = 0; i < dArray.length; i++){
            dArray[i] *= times;
        }
        return dArray;
    }

    /**
     * Prints each index of a double array
     * @param dArray the double array you wish to print
     */
    private static void printDoubleArray(double[] dArray){
        for(double d : dArray){
            System.out.printf("%.1f ", d);
        }
        System.out.println();
    }
}
