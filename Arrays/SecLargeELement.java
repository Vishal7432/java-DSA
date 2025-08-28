package Arrays;

public class SecLargeELement {
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean Swaped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    Swaped = true;
                }
                if (!Swaped) {
                    break;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("array is already sorted");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 4, 5, 8 };
        bubbleSort(arr);
        printArr(arr);
    }
}
