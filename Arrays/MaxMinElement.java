package Arrays;

public class MaxMinElement {
    public static int maxAndMin(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int sunAvgArray(int arr[]) {
        int sum = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            count++;
        }
        return sum = sum / count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 4, 9, 7 };
        // System.out.println(maxAndMin(arr));
        System.out.println(sunAvgArray(arr));
    }
}
