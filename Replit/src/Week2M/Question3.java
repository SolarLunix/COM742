package Week2M;

import java.io.*;

/**
 * Read and write to a file
 * Created by: Melissa Melaugh
 * Created on: 25/01/2021
 * Updated on: 25/01/2021
 * COM742:Week2M:Question3
 */
public class Question3 {
    public static void main(String[] args) {
        final String FILENAME = "C:\\Users\\Solar\\IdeaProjects\\COM742\\Replit\\src\\Week2M\\Q3Test.txt";
        int[] nums = {3, 4, 2, 6, 8, 9, 2, 5, 6, 8, -3, -4, -2, -6};
        writeToFile(nums, FILENAME);
        int pos = countTotalPositiveValue(FILENAME);
        System.out.println(String.format("There were %d positive numbers in the file", pos));
    }

    /**
     * Counts the total positive values in a file and returns the total
     * @param fileName the file from which to read the values
     * @return int total positive values in the file
     */
    public static int countTotalPositiveValue(String fileName) {
        int count = 0;
        int posCount = 0;

        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();

            while (s != null) {
                try {
                    int num = Integer.parseInt(s);
                    if(num >= 0) {
                        posCount++;
                    }
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println(String.format("Current line could not be parsed as an int. \n\t%s", e));
                }
                s = br.readLine();
            }
        } catch (FileNotFoundException e){
            System.out.println(String.format("The file you're looking for does not exist. \n\t%s", e));
        } catch (IOException e){
            System.out.println(String.format("File Reading has encountered an error. \n\t%s", e));
        }
        System.out.println(String.format("There were %d numbers in the file", count));
        return posCount;
    }

    /**
     * Write the values from an int array to a file
     * @param data int array to get the data from
     * @param fileName the file to write the data to
     */
    public static void writeToFile(int[] data, String fileName) {
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (int i : data) {
                pw.println(i);
            }
            pw.close();
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println(String.format("Write Number Method failed: \n\t%s", e));
        }
    }
}
