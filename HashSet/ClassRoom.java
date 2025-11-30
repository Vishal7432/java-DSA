package HashSet;

import java.util.HashSet;

public class ClassRoom {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(5);
        set.add(2);
        set.add(2);
        set.add(4);
        set.add(6);

        System.out.println(set);

        set.remove(2);

        if (set.contains(2)) {
            System.out.println("set element is exist 2");
        }

    }
}
