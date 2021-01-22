package FirstProject;

/**
 * Description: Coding Sprint Starter Code
 * Author: Sonya Coleman, sa.coleman@ulster.ac.uk
 * Updated by: Melissa Melaugh, melaugh-m3@ulster.ac.uk
 * Created on: 15 December 2020
 * Updated on: 11/01/2021
 * COM742:FirstProject:Coursework
 */

import java.io.*;
import java.util.*;

public class Coursework {

    public static void main(String[] args) {
        final int ZERO = 0;

        //int[] numbers = readArrayFromFile("C:\\Users\\Solar\\IdeaProjects\\COM742\\Sprint1\\src\\FirstProject\\practice_data.txt");
        int[] numbers = readArrayFromFile("C:\\Users\\Solar\\IdeaProjects\\COM742\\Sprint1\\src\\FirstProject\\test.txt");

        // Sort array using Bubble sort (code provided)
        bubbleSort(numbers);

        // Statistics
        System.out.println(String.format("Negatives: %d", countNegativeValues(numbers)));
        System.out.println(String.format("Odd Negatives: %d", countNegativeOddValues(numbers)));
        System.out.println(String.format("Zeros: %d", countZeroValues(numbers)));
        System.out.println(String.format("Positives: %d", countPositiveValues(numbers, ZERO)));
        System.out.println(String.format("Total: %d", numbers.length));

        System.out.println(String.format("Minimum: %d", minArrayValue(numbers)));
        System.out.println(String.format("Maximum: %d", maxArrayValue(numbers)));

        System.out.println(String.format("Mean: %f", meanArrayValue(numbers)));
        System.out.println(String.format("Median: %f", medianArrayValue(numbers)));
        System.out.println(String.format("Mode: %d", modeArrayValue(numbers)));


        // Looking for something specific?
        int sumval = 25000;
        System.out.println(String.format("Total of all Positive values greater than %d: %d", sumval, SumPositiveValues(numbers, sumval)));

        //int key = 3555318;
        int key = 84726;
        System.out.println(String.format("Value %d is at: %d", key, binarySearch(numbers, key)));

        int min = -35000;
        int max = 20000;
        System.out.println(String.format("Average odd values between %d and %d: %f",
                min, max, meanOddValue(numbers, min, max)));

        min = -999999;
        max =  999999;
        System.out.println(String.format("Average odd values between %d and %d: %f",
                min, max, meanOddValue(numbers, min, max)));

        sumval = 12000;
        System.out.println(String.format("Positives greater than %d: %d", sumval, countPositiveValues(numbers, sumval)));

    }

    /**
     * Computes mean value from an array
     * @param array int array of values from which mean is computed
     * @return double calculated mean value
     */
    public static double meanArrayValue(int[] array) {
        int total = 0;
        for(int number : array){
            total += number;
        }
        return (double)total/array.length;
    }

    /**
     * Compute the mean of the odd numbers between start and end (inclusive) from an array
     * @param array int array of values from which mean is computed
     * @param start int value of minimum
     * @param end int value of maximum
     * @return double calculated mean value
     */
    public static double meanOddValue(int[] array, int start, int end) {
        int total = 0;
        int count = 0;
        for(int number : array){
            //if odd and between start and end values
            if((number % 2) == 1 && number >= start && number <= end) {
                total += number;
                count++;
            }
        }

        return (double)total/count;
    }

    /**
     * Counts the negative odd integer values in an array
     * @param array int array to be counted
     * @return int number of negative odd values
     */
    public static int countNegativeOddValues(int[] array) {
        int negs = 0;
        for(int number : array){
            if(number < 0 && (Math.abs(number) % 2 == 1)){
                negs++;
            }
        }

        return negs;
    }

    /**
     * Counts the zero integer values in an array
     * @param array int array to be counted
     * @return int number of zero values
     */
    public static int countZeroValues(int[] array) {
        int zeros = 0;
        for(int number : array){
            if(number == 0){
                zeros++;
            }
        }
        return zeros;
    }

    /**
     * Counts the Positive integer values in an array greater than a given value
     * (e.g, count the number of values greater than 10000)
     * @param array int array to be counted
     * @param threshold int threshold value to check against
     * @return int number of values greater than threshold
     */
    public static int countPositiveValues(int[] array, int threshold) {
        int pos = 0;
        for(int number : array){
            if(number > threshold){
                pos++;
            }
        }

        return pos;
    }

    /**
     * Sums the positive integer values in an array above a given threshold (e.g, sum the number of values greater than 10000)
     * @param array int array to be counted
     * @param threshold int threshold value
     * @return int sum of positive values
     */
    public static int SumPositiveValues(int[] array, int threshold) {
        int sum = 0;
        for(int number : array){
            if(number > threshold){
                sum += number;
            }
        }

        return sum;
    }


    /**
     * Reads an array from file using UUlib
     * @param filename string filename of textfile
     * @return int array of numbers
     */
    public static int[] readArrayFromFile(String filename) {
        int[] array = new int[1];

        try {

            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String c = br.readLine();
            Integer size = Integer.parseInt(c);
            array = new int[size];
            //System.out.println(array.length);

            for (int i = 0; i < size; i++) {

                c = br.readLine();
                array[i] = Integer.parseInt(c);
                //System.out.println(array[i]);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println(String.format("Read in %d int values.", array.length));
        return array;
    }

    /**
     * Counts the negative integer values in an array
     * @param array int array to be counted
     * @return int number of nagative values
     */
    public static int countNegativeValues(int[] array) {
        int negs = 0;
        for(int number : array){
            if(number < 0){
                negs++;
            }
        }

        return negs;
    }

    /**
     * Computes median value from a sorted array
     * @param array int array of values from which median is computed
     * @return double calculated median value
     */
    public static double medianArrayValue(int[] array) {
        Arrays.sort(array);  //ensure it's sorted
        double median;
        if (array.length % 2 == 0)
            median = ((double)array[array.length/2] + (double)array[array.length/2 - 1])/2;
        else
            median = (array[array.length/2]);

        return median;
    }

    /**
     * Computes the first mode value from a sorted array
     * @param array int array of values from which mode is computed
     * @return int first mode value
     */
    public static int modeArrayValue(int[] array) {
        Arrays.sort(array);  //ensure it's sorted
        int n = array.length;
        int maxValue = 0, maxCount = 0, i, j;

        for (i = 0; i < n; ++i) {
            int count = 0;
            for (j = 0; j < n; ++j) {
                if (array[j] == array[i])
                    ++count;
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    /**
     * Computes minimum value from an int array
     * @param array int array of values from which to find minimum
     * @return int minimum value
     */
    public static int minArrayValue(int[] array) {
        int min = array[0];
        for(int item : array){
            if(min > item){
                min = item;
            }
        }
        return min;
    }

    /**
     * Computes maximum value from an int array
     * @param array int array of values from which to find maximum
     * @return int maximum value
     */
    public static int maxArrayValue(int[] array) {
        int max = array[0];
        for(int item : array){
            if(max < item){
                max = item;
            }
        }
        return max;
    }

    /**
     * Swaps two values in an int array
     * @param array int array to swap the numbers in
     * @param posA int first position to swap
     * @param posB second position to swap
     */
    public static void swap(int[] array, int posA, int posB) {
        int tmp = array[posA];
        array[posA] = array[posB];
        array[posB] = tmp;
    }

    /**
     * Sorts a int array using bubblesort algoritm
     * @param array int array of values to be sorted
     */
    public static void bubbleSort(int[] array) {
        int ncomps = 0, nswaps = 0; // declare and initialise counters
        for (int out = array.length - 1; out > 0; out--) {
            for (int in = 0; in < out; in++) {
                ncomps++; // increment number of comparisons
                if (array[in] > array[in + 1]) {
                    nswaps++;  // increment number of swaps
                    swap(array, in, in + 1);
                }
            }
        }
        System.out.println("Comps=" + ncomps + " Swaps=" + nswaps);
    }

    /**
     * Performs binary search on an array for a specified value
     * @param array int array of values
     * @param key int key which item to be searched
     * @return int indicating first location of item, or -1 in case not found
     */
    public static int binarySearch(int array[], int key) {
        Arrays.sort(array); //ensure it's sorted

        int first = 0;
        int last = array.length -1;
        int mid = (0 + last)/2;
        int count = 1;

        while( first <= last ){
            if ( array[mid] < key ){
                first = mid + 1;
            }else if ( array[mid] == key ){
                //System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
            count++;
        }

        if ( first > last ){
            mid = -1;
        }
        System.out.println(String.format("It took %d itterations to find %d", count, key));
        return mid;
    }
}