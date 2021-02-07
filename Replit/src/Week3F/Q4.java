package Week3F;

import java.util.HashSet;

/**
 * Hashset test
 * Created by: Melissa Melaugh
 * Created on: 07/02/2021
 * Updated on: 07/02/2021
 * COM742:Week3F:Q4
 */
public class Q4 {
    public static void main(String[] args) {
        int[] numbers = {77, 23, 4, 66, 99, 122, 45, 56, 39, 89};

        HashSet<Integer> numHash = new HashSet<>();
        for(int num : numbers){
            numHash.add(num);
        }//end for

        HashSet<Integer> numHash3 = new HashSet<>();
        for(int num: numHash){
            numHash3.add(num * 3);
        }

        System.out.println(numHash);
        System.out.println(numHash3);
    }//end main
}
