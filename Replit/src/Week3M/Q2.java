package Week3M;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Work with Linked Lists
 * Created by: Melissa Melaugh
 * Created on: 01/02/2021
 * Updated on: 01/02/2021
 * COM742:Week3M:Q2
 */
public class Q2 {
    public static void main(String[] args) {
        LinkedList<String> strList = new LinkedList<>();
        System.out.println(strList);

        strList.add("Mary");
        strList.add("John");
        strList.add("Peter");
        strList.add("Shane");
        strList.add("Seamus");
        strList.add("James");
        System.out.println(strList);

        System.out.println(strList.subList(1, 4));

        Collections.reverse(strList);
        System.out.println(strList);

        Collections.sort(strList);
        System.out.println(strList);

        LinkedList<String> copyStrList = new LinkedList<>();
        strList.forEach(s -> copyStrList.add(" "));
        System.out.println(copyStrList);
        Collections.copy(copyStrList, strList);
        System.out.println(copyStrList);

        Collections.shuffle(copyStrList);
        System.out.println(copyStrList);
        System.out.println(strList);

        System.out.println(String.format("Shane is located at %d in StrList, and %d in CopyStrList.", strList.indexOf("Shane"), copyStrList.indexOf("Shane")));
    }
}
