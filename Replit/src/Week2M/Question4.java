package Week2M;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Read in files and print out their contents
 * Created by: Melissa Melaugh
 * Created on: 25/01/2021
 * Updated on: 25/01/2021
 * COM742:Week2M:Question4
 */
public class Question4 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String stockName = getNextString("Please enter the full path to the file containing the stock names:");
        String stockQty = getNextString("Please enter the full path to the file containing the stock quantity:");
        String stockPrice = getNextString("Please enter the full path to the file containing the stock prices:");

        ArrayList<String> names = readFileStrings(stockName);
        int[] qty = stringToIntArray(readFileStrings(stockQty));
        double[] price = stringToDoubleArray(readFileStrings(stockPrice));

        double[] values = new double[price.length];
        for(int i = 0; i < names.size(); i++){
            values[i] = price[i] * qty[i];
            System.out.println(String.format("%s \t%d \t%.2f \t$%.2f", names.get(i), qty[i], price[i], values[i]));
        }

        String stockValue = getNextString("Please enter the full path to the file where you want your values written:");
        writeToFile(values, stockValue);

        in.close();
    }

    /**
     * Gets the next string from the user
     * @param request String request to the user
     * @return string input from the user
     */
    private static String getNextString(String request){
        String nextString;
        System.out.println(request);
        nextString = in.nextLine();
        return nextString;
    }

    /**
     * Read and print contents of a file to the console
     * @param filename String filename to read from
     */
    private static ArrayList<String> readFileStrings(String filename){
        ArrayList<String> str = new ArrayList<>();
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String c = br.readLine();

            while (c!=null){
                str.add(c);
                c=br.readLine();
            }
            fr.close();
            br.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        return str;
    }

    /**
     * Converts from a string array list to an int array
     * @param numbers ArrayList of String values to convert to ints
     * @return int array of values from numbers
     */
    private static int[] stringToIntArray(ArrayList<String> numbers){
        int[] values = new int[numbers.size()];
        for(int i = 0; i < numbers.size(); i++){
            values[i] = Integer.parseInt(numbers.get(i));
        }
        return values;
    }

    /**
     * Converts from a string array list to a double array
     * @param numbers ArrayList of String values to convert to doubles
     * @return double array of values from numbers
     */
    private static double[] stringToDoubleArray(ArrayList<String> numbers){
        double[] values = new double[numbers.size()];
        for(int i = 0; i < numbers.size(); i++){
            values[i] = Double.parseDouble(numbers.get(i));
        }
        return values;
    }

    /**
     * Write the values from an int array to a file
     * @param data double array to get the data from
     * @param fileName the file to write the data to
     */
    public static void writeToFile(double[] data, String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (double i : data) {
                pw.println(String.format("%.2f", i));
            }
            pw.close();
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println(String.format("Write Number Method failed: \n\t%s", e));
        }
    }
}
