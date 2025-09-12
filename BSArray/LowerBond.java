package BSArray;

public class LowerBond {

    // Given a sorted array of nums and an integer x, write a program to find the
    // lower bound of x.

    // The lower bound algorithm finds the first and smallest index in a sorted
    // array where the value at that index is greater than or equal to a given key
    // i.e. x.

    // If no such index is found, return the size of the array.

    public static int lowerBound(int arr[], int target) {
        int n = arr.length;
        int start = 0, end = n - 1;
        int ans = 0;

        while (start <= end) {
            int mid = start + end / 2;
            if (arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 5, 6, 8, 8, 10, 11 };
        int target = 9;
        int index = lowerBound(arr, target);
        System.out.println("The lower bound is index : " + index);
    }
}
