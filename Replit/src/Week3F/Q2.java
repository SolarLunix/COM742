package Week3F;

import java.util.HashSet;

/**
 * Work with HashSets
 * Created by: Melissa Melaugh
 * Created on: 05/02/2021
 * Updated on: 05/02/2021
 * COM742:Week3F:Q2
 */
public class Q2 {
    public static void main(String[] args) {
        HashSet<String> months1 = new HashSet<>();
        months1.add("Jan");
        months1.add("Feb");
        months1.add("March");
        months1.add("April");
        months1.add("May");
        months1.add("June");

        HashSet<String> months2 = new HashSet<>();
        months2.add("May");
        months2.add("June");
        months2.add("July");
        months2.add("August");

        HashSet<String> intersection = new HashSet<>();
        intersection.addAll(months1);
        intersection.retainAll(months2);

        HashSet<String> union = new HashSet<>();
        union.addAll(months1);
        union.addAll(months2);

        System.out.println(String.format("Months 1: %s", months1.toString()));
        System.out.println(String.format("Months 2: %s", months2.toString()));
        System.out.println(String.format("Intersection: %s", intersection.toString()));
        System.out.println(String.format("Union: %s", union.toString()));

        months1.remove("May");
        months1.remove("June");

        intersection = new HashSet<>();
        intersection.addAll(months1);
        intersection.retainAll(months2);

        union = new HashSet<>();
        union.addAll(months1);
        union.addAll(months2);

        if(intersection.isEmpty()){
            System.out.println("There is not intersection between these lists");
        } else {
            System.out.println(String.format("Intersection: %s", intersection.toString()));
        }

        System.out.println(String.format("%d items in union: %s", union.size(), union.toString()));
    }
}
