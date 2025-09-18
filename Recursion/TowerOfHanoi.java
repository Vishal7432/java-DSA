public class TowerOfHanoi {
    // DSA topic Tower Of Hanoi!

    public static void towerofHanoi(int n, String scr, String hepler, String dest) {

        if (n == 0) {
            return;
        }
        towerofHanoi(n - 1, scr, dest, hepler);
        System.out.println("Transfer disk " + n + " from " + scr + " to " + dest);
        towerofHanoi(n - 1, hepler, scr, dest);
    }

    public static boolean sortedArr(int arr[], int idx) {

        // basecase
        if (idx == arr.length - 1) {
            return true;
        }

        if (arr[idx] < arr[idx + 1]) {
            return sortedArr(arr, idx + 1);
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        // int n = 3;
        // towerofHanoi(n, "S", "H", "D");

        int arr[] = { 1, 2, 3, 5, 6, 6 };
        System.out.println(sortedArr(arr, 0));

    }
}