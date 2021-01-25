package Week2M;

import java.io.*;

/**
 * Change the original code to add a total
 * Created by: Melissa Melaugh
 * Created on: 25/01/2021
 * Updated on: 25/01/2021
 * COM742:Week2M:BufferInt
 */
public class BufferInt {
    public static void main(String[] args) {
        readFile("C:\\Users\\Solar\\IdeaProjects\\COM742\\Replit\\src\\Week2M\\Test1.txt");
    }

    private static void readFile(String filename){
        int total = 0;
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String c = br.readLine();
            int num;


            while (c!=null){
                num = Integer.parseInt(c);
                System.out.println(num);
                total += num;
                c=br.readLine();
            }
            fr.close();
            br.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(String.format("The total for this file is %d", total));
    }
}
