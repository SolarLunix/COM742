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
        // Read array from supplied text file (practice.txt) using method provided
        int[] numbers = readArrayFromFile("C:\\Users\\Solar\\IdeaProjects\\COM742\\Sprint1\\src\\FirstProject\\practice_data.txt");

        // Sort array using Bubble sort (code provided)
        bubbleSort(numbers);

        // Compute the following stats from array obtained from text file
        // Total number of negative values
        System.out.println(String.format("Negatives: %d", countNegativeValues(numbers)));
        // Minimum value
        System.out.println(String.format("Minimum: %d", minArrayValue(numbers)));
        // Maximum value
        System.out.println(String.format("Maximum: %d", maxArrayValue(numbers)));
        // Median and mode values
        System.out.println(String.format("Median: %.1f", medianArrayValue(numbers)));
        System.out.println(String.format("Mode: %d", modeArrayValue(numbers)));
        // Search for key = 3555318 using Binary search
        int key = 3555318;
        System.out.println(String.format("Value %d is at: %d", key, binarySearch(numbers, key)));


    }


    public static int[] readArrayFromFile(String filename) {
        /*
        Description: Reads an array from file using UUlib.
        Parameters:  filename of textfile.
        Returns: int array of numbers
        */
        int[] array = new int[1];

        try {

            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String c = br.readLine();
            Integer size = Integer.parseInt(c);
            array = new int[size];
            System.out.println(array.length);

            for (int i = 0; i < size; i++) {

                c = br.readLine();
                array[i] = Integer.parseInt(c);
                System.out.println(array[i]);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return array;
    }

    public static int countNegativeValues(int[] array) {
        /*
        Description: Counts the negative integer values in an array
        Parameters:  int array to be counted
        Returns: int number of nagative values
        */

        int negs = 0;
        for(int number : array){
            if(number < 0){
                negs++;
            }
        }

        return negs;
    }

    public static double medianArrayValue(int[] array) {
        /*
        Description: Computes median value from a sorted array
        Parameters:  int array of values from which median is computed
        Returns: double calculated median value
        Note: Array must be sorted
        */
        Arrays.sort(array);
        double median;
        if (array.length % 2 == 0)
            median = ((double)array[array.length/2] + (double)array[array.length/2 - 1])/2;
        else
            median = (array[array.length/2]);

        return median;
    }

    public static int modeArrayValue(int[] array) {
        /*
        Description: Computes the first mode value from a sorted array
        Parameters:  int array of values from which mode is computed
        Returns: int first mode value
        Note: Array must be sorted
        */

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

    public static int minArrayValue(int[] array) {
        /*
        Description: Computes minimum value from an int array
        Parameters:  int array of values from which to find minimum
        Returns: int minimum value
        */

        int min = array[0];
        for(int item : array){
            if(min > item){
                min = item;
            }
        }
        return min;
    }

    public static int maxArrayValue(int[] array) {
        /*
        Description: Computes maximum value from an int array
        Parameters:  int array of values from which to find maximum
        Returns: int maximum value
        */
        int max = array[0];
        for(int item : array){
            if(max < item){
                max = item;
            }
        }
        return max;
    }

    public static void swap(int[] array, int posA, int posB) {
        /*
        Description: Swaps two values in an int array
        Parameters:  int array of values and positions of elements to be swapped
        Returns: void
        */
        int tmp = array[posA];
        array[posA] = array[posB];
        array[posB] = tmp;
    }

    public static void bubbleSort(int[] array) {
        /*
        Description: Sorts a int array using bubblesort algoritm
        Parameters:  int array of values to be sorted
        Returns: void
        */
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
     *
     * @param array
     * @param key
     * @return
     */
    public static int binarySearch(int array[], int key) {
        /*
        Description: Performs binary search on an array for a specified value
        Parameters:  int array of values and int key which item to be searched
        Returns: int indicating first location of item, or -1 in case not found
        */
        int first = 0;
        int last = array.length -1;
        int mid = (0 + last)/2;
        int count = 1;

        while( first <= last ){
            if ( array[mid] < key ){
                first = mid + 1;
            }else if ( array[mid] == key ){
                System.out.println("Element is found at index: " + mid);
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
        System.out.println(String.format("It took %d itterations", count));
        return mid;
    }
}