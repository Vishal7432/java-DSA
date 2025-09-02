package Arrays;

public class SecLargeELement {
    public static int bubbleSort(int arr[]) {
        int largest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    // O(2n)

    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 4, 5, 8 };
        System.out.println(bubbleSort(arr));
    }
}
