package HashSet;

import java.util.HashMap;

public class FindItineraryTickets {

    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();

        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key; // Starting point
            }
        }
        return null;

    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("chennai", "bengaluru");
        tickets.put("mumbai", "delhi");
        tickets.put("goa", "chennai");
        tickets.put("delhi", "goa");

        String start = getStart(tickets);

        System.out.print(start);
        while (tickets.containsKey(start)) {
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }

    }
}
