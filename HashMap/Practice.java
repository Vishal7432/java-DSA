import java.util.HashMap;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {

        // Create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert - O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 70);
        hm.put("Nepal", 5);

        // Iterate
        Set<String> key = hm.keySet();
        System.out.println(key);

        // System.out.println(hm);
        // Unorder map in java

        // Get O(1)
        // int population = hm.get("India");
        // System.out.println(population);

        // System.out.println(hm.get("Indonesia"));

        // Contains O(1)
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Indonesia"));

        // // Remove O(1)
        // System.out.println(hm.remove("China"));
        // System.out.println(hm.remove("Indonesia"));

        // System.out.println(hm);

    }
}
