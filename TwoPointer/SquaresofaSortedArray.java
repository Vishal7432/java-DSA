package TwoPointer;

import java.util.Arrays;

public class SquaresofaSortedArray {

    // this brute force methods

    // public int[] sortedSquares(int[] arr) {
    // int n = arr.length;
    // int result[] = new int[n];
    // int idx = 0;
    // for (int i = 0; i < n; i++) {
    // int sr = arr[i] * arr[i];

    // result[idx++] = sr;
    // }
    // Arrays.sort(result);
    // return result;
    // }

    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int result[] = new int[n];
        int idx = n - 1;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int a = arr[left] * arr[left];
            int b = arr[right] * arr[right];

            if (a > b) {
                result[idx--] = a;
                left++;
            } else {
                result[idx--] = b;
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { -4, -1, 0, 3, 10 };
        System.out.println(Arrays.toString(new SquaresofaSortedArray().sortedSquares(arr)));
    }
}
