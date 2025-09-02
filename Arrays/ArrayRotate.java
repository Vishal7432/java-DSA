package Arrays;

public class ArrayRotate {

    public static void rotateArrayAtIdx(int arr[], int idx) {
        int temp[] = new int[arr.length];
        // K is basically used to tracking index of array
        int k = 0;

        // Storing the (arr.length) elements of array arr[] to the front of temp[].
        for (int i = idx; i < arr.length; i++) {
            temp[k] = arr[i];
            k++;
        }

        // Storing the first d elements of array arr[] into temp[]
        for (int i = 0; i < idx; i++) {
            temp[k] = arr[i];
            k++;
        }
        // Copy rotated array back to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 3, 6, 8 };
        int idx = 3;

        rotateArrayAtIdx(arr, idx);
        printArray(arr);
    }
}
