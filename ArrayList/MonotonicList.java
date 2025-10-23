import java.util.ArrayList;

public class MonotonicList {

    public static boolean monotone(ArrayList<Integer> list) {
        // BruteForce approach --> O(n^2)
        int n = list.size();
        if (n <= 1)
            return true;

        boolean nonDecreasing = true;
        boolean nonIncreasing = true;

        // check non-decreasing: for all i<j, list[i] <= list[j]
        for (int i = 0; i < n && nonDecreasing; i++) {
            for (int j = i + 1; j < n; j++) {
                if (list.get(i) > list.get(j)) {
                    nonDecreasing = false;
                    break;
                }
            }
        }

        // check non-increasing: for all i<j, list[i] >= list[j]
        for (int i = 0; i < n && nonIncreasing; i++) {
            for (int j = i + 1; j < n; j++) {
                if (list.get(i) < list.get(j)) {
                    nonIncreasing = false;
                    break;
                }
            }
        }

        return nonDecreasing || nonIncreasing;
    }

    public static boolean optimal(ArrayList<Integer> list) {
        int n = list.size();
        if (n >= 1) {
            return true;
        }

        boolean nonIncreasing = true;
        boolean nonDecreasing = true;

        for (int i = 1; i < n; i++) {

            if (list.get(i) < list.get(i - 1)) {
                nonDecreasing = false;
            }
            if (list.get(i) > list.get(i - 1)) {
                nonIncreasing = false;
            }
            // early exit if both become false
            if (!nonDecreasing && !nonIncreasing) {
                return false;
            }
        }

        return nonIncreasing || nonDecreasing;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(9);
        list.add(7);
        list.add(6);
        list.add(4);
        list.add(2);
        list.add(1);
        // System.out.println(monotone(list));
        System.out.println(optimal(list));
    }
}
