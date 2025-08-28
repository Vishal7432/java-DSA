package Sorting;

public class BubbleSort {
    public static void bubblrSort(int arr[]) {
        int n = arr.length;
        for (int term = 0; term < n; term++) {
            boolean swaped = false;
            for (int j = 0; j < n - 1 - term; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaped = true;
                }
            }
            if (!swaped) {
                break;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Array is already sorted !");
    }

    public static int secLargeElement(int arr[]) {
        int SecLarge = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            SecLarge = arr[arr.length - 2];
        }
        return SecLarge;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 4, 5, 8 };
        bubblrSort(arr);
        printArr(arr);
        System.out.println(secLargeElement(arr));
    }
}
