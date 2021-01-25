package Week2M;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * //TODO: Project Description
 * Created by: Melissa Melaugh
 * Created on: 25/01/2021
 * Updated on: 25/01/2021
 * COM742:Week2M:Question1
 */
public class Question1 {
    public static void main(String[] args) {
        writeNumbers("C:\\Users\\Solar\\IdeaProjects\\COM742\\Replit\\src\\Week2M\\Fifty.txt");
    }

    /**
     * Write the numbers from 1 to 50 to a file
     * @param filename the filename as a string for where to write the file
     */
    public static void writeNumbers(String filename) {
        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for(int i=1; i <= 50; i++){
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
