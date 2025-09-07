package Arrays;

import java.util.ArrayList;

public class MoveZeroLast {

    public static int[] moveZeros(int n, int arr[]) {
        // temporary array:
        ArrayList<Integer> temp = new ArrayList<>();
        // copy non-zero elements
        // from original -> temp array:
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                temp.add(arr[i]);
        }

        // number of non-zero elements.
        int nz = temp.size();

        // copy elements from temp
        // fill first nz fields of
        // original array:
        for (int i = 0; i < nz; i++) {
            arr[i] = temp.get(i);
        }

        // fill rest of the cells with 0:
        for (int i = nz; i < n; i++) {
            arr[i] = 0;
        }
        return arr;
    }

    /// Optimal solution move zero in last 
    public static int[] Optimal(int n, int arr[]) {
        int j = -1;
        // place the pointer j:
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // no non-zero elements:
        if (j == -1)
            return arr;

        // Move the pointers i and j
        // and swap accordingly:
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                // swap a[i] & a[j]:
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
        int n = arr.length;
        int ans[] = Optimal(n, arr);
        // int[] ans = moveZeros(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }
}
