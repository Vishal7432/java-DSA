package Sorting;

public class Assignment {

    // Merge Sort function
    public static String[] mergeSort(String[] arr, int lo, int hi) {
        if (lo == hi) {
            String[] A = { arr[lo] }; // single element array return
            return A;
        }

        int mid = lo + (hi - lo) / 2;

        // left half sort
        String[] arr1 = mergeSort(arr, lo, mid);

        // right half sort
        String[] arr2 = mergeSort(arr, mid + 1, hi);

        // dono ko merge karke sorted array banao
        String[] arr3 = merge(arr1, arr2);

        return arr3;
    }

    // Merge two sorted arrays
    static String[] merge(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        String[] arr3 = new String[m + n];
        int idx = 0;
        int i = 0;
        int j = 0;

        // compare and merge
        while (i < m && j < n) {
            if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
                arr3[idx] = arr1[i];
                i++;
            } else {
                arr3[idx] = arr2[j];
                j++;
            }
            idx++;
        }

        // agar left me bache hue element hain
        while (i < m) {
            arr3[idx] = arr1[i];
            i++;
            idx++;
        }

        // agar right me bache hue element hain
        while (j < n) {
            arr3[idx] = arr2[j];
            j++;
            idx++;
        }

        return arr3;
    }

    // Alphabetical order check
    static boolean isAlphabeticallySmaller(String str1, String str2) {
        return str1.compareTo(str2) < 0;
    }

    // Given an array nums of size n, return the majority element.

    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury" };

        String[] a = mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
