package BSArray;

public class LowerBond {

    // Given a sorted array of nums and an integer x, write a program to find the
    // lower bound of x.

    // The lower bound algorithm finds the first and smallest index in a sorted
    // array where the value at that index is greater than or equal to a given key
    // i.e. x.

    // If no such index is found, return the size of the array.

    public static int lowerBound(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] >= x) {
                // lower bound found:
                return i;
            }
        }
        return n;
    }

    public static int Optimal(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] > x) {
                ans = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 15, 19 };
        int n = 5, x = 4;
        int ind = Optimal(arr, n, x);
        System.out.println("The lower bound is the index: " + ind);
    }
}
