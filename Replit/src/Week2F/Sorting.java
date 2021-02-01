package Week2F;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * //TODO: Project Description
 * Created by: Melissa Melaugh
 * Created on: 29/01/2021
 * Updated on: 29/01/2021
 * COM742:Week2F:Sorting
 */
public class Sorting {
    public static void main(String[] args) {
        System.out.println("CODE RUNNING\n\n~ ~ ~ ~ ~ ~ ~\n\n");
        //initialise array
        int[] numbers = new int[] {2, 5, 9, 3, 13, 1, 16, 7, 8, 15, 4, 6};
        printArray(numbers);
        bubbleSort(numbers);
        printArray(numbers);
        numbers = new int[] {2, 5, 9, 3, 13, 1, 16, 7, 8, 15, 4, 6};
        bubbleSortQuick(numbers);
        printArray(numbers);
        numbers = new int[] {2, 5, 9, 3, 13, 1, 16, 7, 8, 15, 4, 6};
        selectionSort(numbers);
        printArray(numbers);
        numbers = new int[] {2, 5, 9, 3, 13, 1, 16, 7, 8, 15, 4, 6};
        selectionSortQuick(numbers);
        printArray(numbers);
        numbers = new int[] {2, 5, 9, 3, 13, 1, 16, 7, 8, 15, 4, 6};
        insertionSort(numbers);
        printArray(numbers);
        System.out.println("\n\n~ ~ ~ ~ ~ ~ ~\n\n");

        numbers = readNumbers("File1.txt");
        printArray(numbers);
        bubbleSort(numbers);
        printArray(numbers);
        numbers = readNumbers("File1.txt");
        bubbleSortQuick(numbers);
        printArray(numbers);
        numbers = readNumbers("File1.txt");
        selectionSort(numbers);
        printArray(numbers);
        numbers = readNumbers("File1.txt");
        selectionSortQuick(numbers);
        printArray(numbers);
        numbers = readNumbers("File1.txt");
        insertionSort(numbers);
        printArray(numbers);
        System.out.println("\n\n~ ~ ~ ~ ~ ~ ~\n\n");

        numbers = readNumbers("File2.txt");
        printArray(numbers);
        bubbleSort(numbers);
        printArray(numbers);
        numbers = readNumbers("File2.txt");
        bubbleSortQuick(numbers);
        printArray(numbers);
        numbers = readNumbers("File2.txt");
        selectionSort(numbers);
        printArray(numbers);
        numbers = readNumbers("File2.txt");
        selectionSortQuick(numbers);
        printArray(numbers);
        numbers = readNumbers("File2.txt");
        insertionSort(numbers);
        printArray(numbers);
        System.out.println("\n\n~ ~ ~ ~ ~ ~ ~\n\n");

        numbers = readNumbers("File3.txt");
        printArray(numbers);
        bubbleSort(numbers);
        printArray(numbers);
        numbers = readNumbers("File3.txt");
        bubbleSortQuick(numbers);
        printArray(numbers);
        numbers = readNumbers("File3.txt");
        selectionSort(numbers);
        printArray(numbers);
        numbers = readNumbers("File3.txt");
        selectionSortQuick(numbers);
        printArray(numbers);
        numbers = readNumbers("File3.txt");
        insertionSort(numbers);
        printArray(numbers);
        System.out.println("\n\n~ ~ ~ ~ ~ ~ ~\n\n");

        generateRandom(10);
    }//end main

    public static void bubbleSort(int [] numbers){
        int comp = 0;
        int swap = 0;
        for(int out = (numbers.length - 1); out > 0; out-- ){
            for(int in = 0; in < out; in++){
                if (numbers[in] > numbers[in+1]){
                    int temp = numbers[in];
                    numbers[in] = numbers[in+1];
                    numbers[in+1] = temp;
                    swap++;
                }//end if
                comp++;
            }//end for in
        }//end for out
        System.out.println(String.format("\nBubble Sort on list size %d", numbers.length));
        System.out.println(String.format("Comparisons: %d, Swaps: %d", comp, swap));
    }//end bubbleSort

    public static void bubbleSortQuick(int [] numbers){
        int comp = 0;
        int swap = 0;
        boolean swapped = false;
        for(int out = (numbers.length - 1); out > 0; out-- ){
            swapped = false;
            for(int in = 0; in < out; in++){
                if (numbers[in] > numbers[in+1]){
                    int temp = numbers[in];
                    numbers[in] = numbers[in+1];
                    numbers[in+1] = temp;
                    swap++;
                    swapped = true;
                }//end if
                comp++;
            }//end for in
            if(!swapped){
                System.out.println(String.format("\nBubble Sort on list size %d", numbers.length));
                System.out.println(String.format("Comparisons: %d, Swaps: %d", comp, swap));
                return;
            }//end if
        }//end for out
        System.out.println(String.format("\nBubble Sort on list size %d", numbers.length));
        System.out.println(String.format("Comparisons: %d, Swaps: %d", comp, swap));
    }//end bubbleSort

    public static int[] readNumbers(String filename) {
        try{
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            int len = Integer.parseInt(br.readLine());
            int[] numbers = new int[len];
            for(int i = 0; i < len; i++){
                numbers[i] = Integer.parseInt(br.readLine());
            }//end for i
            return numbers;
        } catch (IOException e){
            System.out.println("File was unable to be read");
            System.out.println(e);
        }//end trycatch
        return new int[] {0};
    }//end readNumbers

    public static void generateRandom(int qty){
        Random rnd = new Random();
        int[] numbers = new int[qty];
        for(int i = 0; i < qty; i++){
            numbers[i] = rnd.nextInt(100) + 1; //between 1 and 100 add one because 0 indexed
        }//end for i
        printArray(numbers);

        int[] nums1 = numbers.clone();
        bubbleSort(nums1);
        printArray(nums1);

        nums1 = numbers.clone();
        selectionSort(nums1);
        printArray(nums1);

        nums1 = numbers.clone();
        selectionSortQuick(nums1);
        printArray(nums1);

        nums1 = numbers.clone();
        insertionSort(nums1);
        printArray(nums1);
    }//end generateRandom

    public static void selectionSort(int [] numbers){
        int comp = 0;
        int swap = 0;
        for(int out = 0; out < (numbers.length-1); out++){
            int min = out;
            for(int in = (out + 1); in < numbers.length; in++){
                comp++;
                if(numbers[in] < numbers[min]){
                    min = in;
                }//end if
            }//end for in
            if(min != out){
                int hold = numbers[out];
                numbers[out] = numbers[min];
                numbers[min] = hold;
                swap++;
            }//end if
        }//end for out
        System.out.println(String.format("\nSelection Sort on list size %d", numbers.length));
        System.out.println(String.format("Comparisons: %d, Swaps: %d", comp, swap));
    }//end selectionSort


    public static void selectionSortQuick(int [] numbers){
        int comp = 0;
        int swap = 0;
        for(int out = 0; out < (numbers.length-1); out++){
            int min = out;
            for(int in = (out + 1); in < numbers.length; in++){
                comp++;
                if(numbers[in] < numbers[min]){
                    min = in;
                }//end if
            }//end for in
            if(min != out){
                int hold = numbers[out];
                numbers[out] = numbers[min];
                numbers[min] = hold;
                swap++;
            }else{
                System.out.println(String.format("\nSelection Sort on list size %d", numbers.length));
                System.out.println(String.format("Comparisons: %d, Swaps: %d", comp, swap));
                return;
            }//end if
        }//end for out
        System.out.println(String.format("\nSelection Sort on list size %d", numbers.length));
        System.out.println(String.format("Comparisons: %d, Swaps: %d", comp, swap));
    }//end selectionSort

    public static void insertionSort(int [] numbers){
        int comp = 0;
        int swap = 0;
        int in=1;
        for(int out=1; out < numbers.length; out++){
            int temp = numbers[out];
            comp++;
            for(in=out; in>0 && numbers[in-1] >= temp; in--){
                numbers[in] = numbers[in-1];
                swap++;
            }//end for in
            numbers[in] = temp;
        }//end for out
        System.out.println(String.format("\nSelection Sort on list size %d", numbers.length));
        System.out.println(String.format("Comparisons: %d, Shifts: %d", comp, swap));

    }//end selectionSort

    public static void printArray(int[] numbers){
        System.out.print("{ ");
        int length = numbers.length;
        for(int i = 0; i < length; i++){
            if(i < length-1) {
                System.out.print(String.format("%d, ", numbers[i]));
            } else {
                System.out.print(String.format("%d ", numbers[i]));
            } //end if else
        }//end for i
        System.out.println("}");
    }//end printArray
}
