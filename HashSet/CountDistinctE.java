package HashSet;

import java.util.HashSet;

public class CountDistinctE {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        int arr[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };

        for (int num : arr) {
            set.add(num);
        }
        System.out.println("Ans = " + set.size());
    }
}
