package Sorting;
import java.util.Arrays;


public class Insertion {
    public static void insertion(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prevs = i-1;
            // Find out the correct position to insert
            while (prevs >= 0 && arr[prevs] > curr) {
                arr[prevs+1] = arr[prevs];
                prevs--;
            }
            //Insertion
            arr[prevs+1] = curr;
        }
    }
    public static void printAr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " " );
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        // insertion(arr);
        Arrays.sort(arr);
        printAr(arr);
    }
}
