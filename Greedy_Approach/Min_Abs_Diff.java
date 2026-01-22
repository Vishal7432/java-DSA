package Greedy_Approach;

import java.util.Arrays;

public class Min_Abs_Diff {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 2, 1, 3 };

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int minAbsDiff = 0;

        for (int i = 0; i < arr1.length; i++) {
            minAbsDiff += Math.abs(arr1[i] - arr2[i]);
        }

        System.out.println("Min abs difference = " + minAbsDiff);
    }
}
