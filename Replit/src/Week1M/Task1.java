package Week1M;

/**
 * //TODO: Project Description
 * Created by: Melissa Melaugh
 * Created on: 18/01/2021
 * Updated on: 18/01/2021
 * COM742:Week1M.Task1
 */
class Task1 { //class Main
    public static void main(String[] args) {
        //Test the default correct input
        int sum = sumRange(1, 10);
        System.out.println(String.format("The sum is %d", sum));

        //Test when the input is submitted backwards
        sum = sumRange(10, 1);
        System.out.println(String.format("The sum is %d", sum));

        //Test when the input values are the same
        sum = sumRange(10, 10);
        System.out.println(String.format("The sum is %d", sum));

    }

    /**
     * This method sums all of the integers within a given range.
     * @param s the lower value
     * @param e the higher value
     * @return (int) the sum within this range
     */
    public static int sumRange(int s, int e){
        int n;

        //Check the order of s and e
        if(s < e){ //If they're input correctly
            n = e - s + 1;
        } else if(s == e){ //If they're the same
            return s;
        }else{ //If they're input backwards
            n = s - e + 1;
        }

        return (n * (s + e)) / 2;
    }
}