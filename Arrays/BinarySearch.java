package Arrays;

public class BinarySearch {
    public static int binarySearch(int numbres[], int key){
        int start = 0, end = numbres.length - 1;
        while (start <= end) {
            int mid = (start + end)/2;

            // comparisons
            if (numbres[mid] == key) {
                return mid;
            }
            if (numbres[mid] < key) { //right
                start = mid + 1;
            }else{ //left
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbres [] = {2, 4,  8, 11, 13, 14, 15, 18};
        int key = 20; 
        System.out.println("Key index of an array : = " + binarySearch(numbres, key));
    }
}
