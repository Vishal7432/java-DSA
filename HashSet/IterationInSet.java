package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class IterationInSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Dehli");
        cities.add("Mumbai");
        cities.add("Noide");
        cities.add("Bangaluru");

        // Iterator it = cities.iterator();
        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }

        for (String City : cities) {
            System.out.println(City);
        }

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Dehli");
        lhs.add("Mumbai");
        lhs.add("Noide");
        lhs.add("Bangaluru");

        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Dehli");
        ts.add("Mumbai");
        ts.add("Noide");
        ts.add("Bangaluru");

        System.out.println(ts);
        ts.remove("Noide");
    }
}
