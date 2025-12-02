package HashSet;

import java.util.HashSet;

public class UnionInterSection {
    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        HashSet<Integer> set = new HashSet<>();

        // Union
        for (int el : arr1) {
            set.add(el);
        }
        for (int el : arr2) {
            set.add(el);
        }
        System.out.println("Union Arr Size :" + set.size());
        System.out.println(set);

        // // Intersection
        // set.clear();
        // int count = 0;
        // for (int el : arr1) {
        // set.add(el);
        // }
        // int element = 0;
        // for (int i = 0; i < arr2.length; i++) {
        // if (set.contains(arr2[i])) {
        // count++;
        // set.remove(arr2[i]);
        // }
        // }

        // System.out.println("Intersection :" + count);

        // Intersection
        set.clear();
        HashSet<Integer> intersection = new HashSet<>();

        // Put arr1 elements in set
        for (int el : arr1) {
            set.add(el);
        }

        // Check arr2 and find intersection
        for (int el : arr2) {
            if (set.contains(el)) {
                intersection.add(el); // unique intersection
            }
        }

        // Print result
        System.out.println("Intersection Size : " + intersection.size());
        System.out.println("Intersection Elements : " + intersection);
    }
}
