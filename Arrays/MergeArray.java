package Arrays;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int arr1[] = { 10, 20, 30 };
        int arr2[] = { 40, 50, 60, 70, 80 };

        // determining length of both arrays
        int a1 = arr1.length;
        int b1 = arr2.length;

        // resultant array size
        int c1 = a1 + b1;

        // Creating a new array
        int[] c = new int[c1];

        // Loop to store the elements of first
        // array into resultant array
        for (int i = 0; i < a1; i++) {

            // Storing the elements in
            // the resultant array
            c[i] = arr1[i];
        }

        // Loop to concat the elements of second
        // array into resultant array
        for (int i = 0; i < b1; i++) {

            // Storing the elements in the
            // resultant array
            c[a1 + i] = arr2[i];
        }

        System.out.println("" + Arrays.toString(c));
    }
}
