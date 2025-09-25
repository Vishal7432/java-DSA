package Sorting;

public class RotatedArray {

    public static int search(int arr[], int si, int ei, int target) {

        if (si > ei) {
            return -1;
        }

        // find mid
        int mid = (si + ei) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // mid on L1
        if (arr[si] <= arr[mid]) {

            // Case a:
            if (arr[si] <= target && arr[mid] >= target) {
                return search(arr, si, mid - 1, target);
            }
            // Case b:
            else {
                return search(arr, mid + 1, ei, target);
            }
        }

        // mid on L2
        else {
            // Case c:
            if (arr[mid] <= target && arr[ei] >= target) {
                return search(arr, mid + 1, ei, target);
            }
            // Case d:
            else {
                return search(arr, si, mid - 1, target);
            }
        }

    }

    public static int sortSearch(int arr[], int si, int ei, int target) {

        while (si <= ei) {

            int mid = (si + ei) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // find which part is sorted
            // condition for left part sorted
            if (arr[si] <= arr[mid]) {
                // ensure the target is in between start & mid
                if (arr[si] <= target && target <= arr[mid])
                    ei = mid - 1;
                // else target in right hand side so search right
                else
                    si = mid + 1;

            }
            // if left part not sorted order , definatly the right part is sorted
            else {
                // ensure the target is right in by part or right side of array
                if (arr[mid] <= target && target <= arr[ei])
                    si = mid + 1;
                // else target may be in left
                else
                    ei = mid - 1;
            }
        }
        // if element not found return -1
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 5;

        // int ans = search(arr, 0, arr.length, target);
        // System.out.println(ans);

        int ans = sortSearch(arr, 0, arr.length - 1, target);
        System.out.println(ans);
    }
}