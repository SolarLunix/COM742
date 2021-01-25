package Week2M;

import java.io.*;

/**
 * Read numbers from a file
 * Created by: Melissa Melaugh
 * Created on: 25/01/2021
 * Updated on: 25/01/2021
 * COM742:Week2M:Question2
 */
public class Question2 {
    public static void main(String[] args) {
        readNumbers("C:\\Users\\Solar\\IdeaProjects\\COM742\\Replit\\src\\Week2M\\Fifty.txt");
    }

    /**
     * Read in Numbers from a file and count how many numbers
     * @param fname the name and path of the file to read from
     */
    public static void readNumbers(String fname){
        int count = 0;

        try {
            FileReader fr = new FileReader(fname);
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();

            while (s != null) {
                try {
                    Integer.parseInt(s);
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
    }
}
