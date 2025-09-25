package Sorting;

public class CountInvirsion {
    public static void mergesort(int arr[], int si, int ei) {
        // base Case
        if (si >= ei) {
            return;
        }

        // Kaam
        int mid = si + (ei - si) / 2;
        mergesort(arr, si, mid); // left
        mergesort(arr, mid + 1, ei); // Right

        merge(arr, si, mid, ei);
    }

    public static int merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];

        int i = si;
        int j = mid + 1;
        int idx = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[idx] = arr[i];
                i++;
                idx++;
            } else {
                temp[idx] = arr[j];
                j++;
                idx++;
            }

            while (i <= mid) {
                temp[idx] = arr[i];
                i++;
                idx++;
            }

            while (j <= ei) {
                temp[idx] = arr[j];
                j++;
                idx++;
            }
        }
    }

    public static int numberOfInversions(int[] arr, int n) {
        // Count the number of pairs:
        return mergesort(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 4, 1 };
    }
}
/*
 * private static int merge(int[] arr, int low, int mid, int high) {
 * ArrayList<Integer> temp = new ArrayList<>(); // temporary array
 * int left = low; // starting index of left half of arr
 * int right = mid + 1; // starting index of right half of arr
 * 
 * //Modification 1: cnt variable to count the pairs:
 * int cnt = 0;
 * 
 * //storing elements in the temporary array in a sorted manner//
 * 
 * while (left <= mid && right <= high) {
 * if (arr[left] <= arr[right]) {
 * temp.add(arr[left]);
 * left++;
 * } else {
 * temp.add(arr[right]);
 * cnt += (mid - left + 1); //Modification 2
 * right++;
 * }
 * }
 * 
 * // if elements on the left half are still left //
 * 
 * while (left <= mid) {
 * temp.add(arr[left]);
 * left++;
 * }
 * 
 * // if elements on the right half are still left //
 * while (right <= high) {
 * temp.add(arr[right]);
 * right++;
 * }
 * 
 * // transfering all elements from temporary to arr //
 * for (int i = low; i <= high; i++) {
 * arr[i] = temp.get(i - low);
 * }
 * return cnt; // Modification 3
 * }
 * 
 * public static int mergeSort(int[] arr, int low, int high) {
 * int cnt = 0;
 * if (low >= high) return cnt;
 * int mid = (low + high) / 2 ;
 * cnt += mergeSort(arr, low, mid); // left half
 * cnt += mergeSort(arr, mid + 1, high); // right half
 * cnt += merge(arr, low, mid, high); // merging sorted halves
 * return cnt;
 * }
 * 
 * public static int numberOfInversions(int[] a, int n) {
 * // Count the number of pairs:
 * return mergeSort(a, 0, n - 1);
 * }
 */