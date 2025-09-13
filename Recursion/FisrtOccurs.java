

public class FisrtOccurs {

    public static int firstOccurs(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;

        }

        if (arr[i] == key) {
            return i;
        }

        return firstOccurs(arr, key, i + 1);
    }

    public static int lastOccurence(int arr[], int key, int i) {
        int isFound = lastOccurence(arr, key, i + 1);
        if (i == arr.length) {
            return -1;
        }
        if (isFound != 1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 8, 3, 5, 7, 9, 5, 10, 11 };
        int key = 5;
        System.out.println(firstOccurs(arr, key, 0));
    }
}