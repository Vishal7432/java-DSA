
// import java.util.LinkedHashMap;
import java.util.*;

public class LinkedHash {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 100);
        lhm.put("US", 50);
        lhm.put("China", 150);
        lhm.put("Nepal", 10);

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("US", 50);
        hm.put("China", 150);
        hm.put("Nepal", 10);

        System.out.println(lhm);
        System.out.println(hm);

    }
}
