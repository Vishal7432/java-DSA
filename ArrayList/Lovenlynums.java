import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Lovenlynums {

    public static ArrayList<Integer> getNumber(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();

        // Sort list to check consecutive numbers easily
        Collections.sort(list);

        int n = list.size();

        for (int i = 0; i < n; i++) {
            int curr = list.get(i);
            boolean isLovenly = true;

            if (i > 0 && curr - 1 <= list.get(i - 1)) {
                isLovenly = false;
            }
            if (i < n - 1 && curr + 1 >= list.get(i + 1)) {
                isLovenly = false;
            }

            if (isLovenly) {
                result.add(curr);
            }
        }
        return result;
    }

    // optimal Approach TC => O(n) SC => O(n)
    public static ArrayList<Integer> getLonelyNumbers(ArrayList<Integer> list) {
        HashSet<Integer> set = new HashSet<>(list); // store all numbers for O(1) lookup
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : list) {
            if (!set.contains(num - 1) && !set.contains(num + 1)) {
                result.add(num); // lonely number
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        // System.out.println(getNumber(list));
        System.out.println(getLonelyNumbers(list));
    }
}
