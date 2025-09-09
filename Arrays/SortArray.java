package Arrays;

public class SortArray {
    // Given an array nums with n objects colored red, white, or blue, sort them
    // in-place so that objects of the same color are adjacent, with the colors in
    // the order red, white, and blue.
    // We will use the integers 0,1,and 2 to represent
    // the color red,white,
    // and blue, respectively.

    public static void sorting(int arr[]) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }
        for (int i = count0; i < count0 + count1; i++) {
            arr[i] = 1;
        }
        for (int i = count0 + count1; i < arr.length; i++) {
            arr[i] = 2;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 0, 2, 1, 1, 0 };
        sorting(arr);

    }
}
