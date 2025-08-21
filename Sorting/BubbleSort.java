package Sorting;

public class BubbleSort {
    public static void bubblrSort(int arr[]){
        int n = arr.length;
        for(int term = 0; term<n; term++){
            boolean swaped = false;
            for(int j=0; j<n-1-term; j++){
                if (arr[j] > arr[j+1]) {
                //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaped = true;
                }
            }
            if (!swaped) {
                break;
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("Array is already sorted !");
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        bubblrSort(arr);
        printArr(arr);
    }
}
