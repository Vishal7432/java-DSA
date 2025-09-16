
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
        if (i == arr.length) {
            return -1;
        }
        // recursion call
        int isFound = lastOccurence(arr, key, i + 1);

        // If found later, return that index.
        if (isFound != -1) {
            return isFound;
        }

        if (arr[i] == key) {
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 8, 3, 5, 7, 9, 5, 10, 5 };
        int key = 5;
        System.out.println(lastOccurence(arr, key, 0));
    }
}