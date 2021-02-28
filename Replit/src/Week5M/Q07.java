package Week5M;

/**
 * //TODO: Project Description
 * Created by: Melissa Melaugh
 * Created on: 19/02/2021
 * Updated on: 19/02/2021
 * COM742:Week5M:Q07
 */
public class Q07 {
    public static void main(String[] args)
    {
        int testArray[] = {64, 34, 25, 12, 22, 11, 90};

        bubbleSort(testArray, testArray.length);

        System.out.println("Sorted array : ");
        for (int i = 0; i < testArray.length; i++){
            System.out.print(testArray[i] + "  ");
        }
    }

    // A recursive function to implement bubble sort
    public static void bubbleSort(int arr[], int n)
    {
        // Base case
        if (n == 1)
            return;

        // One pass of bubble sort. After this pass, the //largest element is moved (or bubbled) to end.

        for (int i = 0; i <n-1; i++)
            if (arr[i] > arr[i+1])
            {
                // swap arr[i], arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

        // Largest element is fixed,
        // call the method for remaining array
        bubbleSort(arr, n-1);
    }

}
