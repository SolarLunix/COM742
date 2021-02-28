package Week5F;

import java.io.*;
import java.util.Random;

/**
 * Exploration of algorithm complexity
 * Created by: Melissa Melaugh
 * Created on: 21/02/2021
 * Updated on: 21/02/2021
 * COM742:Week5F:Q4
 */
public class Q4 {
    private static final int AMOUNT = 1000;

    public static void main(String[] args) {
        final String MY_FILE = "C:\\Users\\Solar\\IdeaProjects\\COM742\\Replit\\src\\Week5F\\Comparing.txt";
        System.out.println(String.format("The avearage of the numbers in the file is %.2f", readNumbersAvgWhile(MY_FILE)));
        System.out.println(String.format("The avearage of the numbers in the file is %.2f", readNumbersAvgFor(MY_FILE)));
    }

    public static double readNumbersAvgWhile(String fname){
        int count = 0; // 1
        int total = 0; // 1

        try {
            FileReader fr = new FileReader(fname); // 1
            BufferedReader br = new BufferedReader(fr); // 1
            String s = br.readLine(); //1

            while (s != null) { //n
                try {
                    total += Integer.parseInt(s); //n
                    count++; //n
                } catch (NumberFormatException e) {
                    System.out.println(String.format("Current line could not be parsed as an int. \n\t%s", e)); //n
                }
                s = br.readLine(); //n
            }
        } catch (FileNotFoundException e){
            create1000(fname); //1
            return readNumbersAvgWhile(fname); //1
        } catch (IOException e){
            System.out.println(String.format("File Reading has encountered an error. \n\t%s", e)); //1
        } // end try catch
        return((double)total / count); //1
        //f(N) = 5n + 9
        //O(N)
    }//end readNumbersAvgWhile

    public static double readNumbersAvgFor(String fname){
        int count = 0; // 1
        int total = 0; // 1

        try {
            FileReader fr = new FileReader(fname); // 1
            BufferedReader br = new BufferedReader(fr); // 1
            String s = br.readLine(); //1

            for(int i=0; i<AMOUNT; i++) { //2n +1
                try {
                    total += Integer.parseInt(s); //n
                    count++; //n
                } catch (NumberFormatException e) {
                    System.out.println(String.format("Current line could not be parsed as an int. \n\t%s", e)); //n
                }
                s = br.readLine(); //n
            }
        } catch (FileNotFoundException e){
            create1000(fname); //1
            return readNumbersAvgFor(fname); //1
        } catch (IOException e){
            System.out.println(String.format("File Reading has encountered an error. \n\t%s", e)); //1
        } // end try catch
        return((double)total / count); //1
        //f(N) = 7n + 9
        //O(N)
    }//end readNumbersAvgWhile

    private static void create1000(String filename){
        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            Random rnd = new Random();
            for(int i = 0; i < AMOUNT; i++){
                pw.println((rnd.nextInt(AMOUNT * 10)+1));
            }//end for i
            pw.close();
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println(String.format("Write Number Method failed: \n\t%s", e));
        }//end try catch
    }//end create1000
}
