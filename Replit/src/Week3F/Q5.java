package Week3F;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

/**
 * Hashset practice
 * Created by: Melissa Melaugh
 * Created on: 07/02/2021
 * Updated on: 07/02/2021
 * COM742:Week3F:Q5
 */
public class Q5 {
    public static void main(String[] args) {
        final String NUMBERSA = "C:\\Users\\Solar\\IdeaProjects\\COM742\\Replit\\src\\Week3F\\NumbersA.txt";
        final String NUMBERSB = "C:\\Users\\Solar\\IdeaProjects\\COM742\\Replit\\src\\Week3F\\NumbersB.txt";

        HashSet numbersA = readFile(NUMBERSA);
        HashSet numbersB = readFile(NUMBERSB);

        System.out.println("Numbers A: " + numbersA);
        System.out.println("Numbers B: " + numbersB);

        HashSet<Integer> intersection = new HashSet<>();
        intersection.addAll(numbersA);
        intersection.retainAll(numbersB);
        System.out.println("Intersection: " + intersection);

        HashSet<Integer> union = new HashSet<>();
        union.addAll(numbersA);
        union.addAll(numbersB);
        System.out.println("Union: " + union);

        int num = 10;
        System.out.println("NumbersA " + (numbersA.contains(num)? "contains": "does not contain") + " the number " + num);
        System.out.println("NumbersB " + (numbersB.contains(num)? "contains": "does not contain") + " the number " + num);
    }

    private static HashSet<Integer> readFile(String filename){
        HashSet<Integer> numbers = new HashSet<>();
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String c = br.readLine();

            while (c!=null){
                numbers.add(Integer.parseInt(c));
                c=br.readLine();
            }//end while
            fr.close();
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        } //end try catch
        return numbers;
    }//end readFile
}
