import java.util.ArrayList;

public class PairSumTwo {

    // Optimal approach
    public static boolean PairSum(ArrayList<Integer> list, int target) {

        // find breking point in arraylist
        int bp = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) { // Breaking point
                bp = i;
                break;
            }
        }

        int lp = bp + 1; // smallest num
        int rp = bp; // greatest num.

        int n = list.size();

        while (lp != rp) {
            // Case 1.
            if (list.get(lp) + list.get(rp) == target) {
                return true;
                // Case 2.
            } else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
                // Case 3
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(PairSum(list, target));
    }
}
