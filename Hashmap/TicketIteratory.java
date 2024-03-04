import java.util.*;

public class TicketIteratory {

    public static String getstart(HashMap<String, String> tickets) {
        HashMap<String, String> hs = new HashMap<>();
        for (String key : tickets.keySet()) {
            hs.put(tickets.get(key), key);
        }
        for (String key : tickets.keySet()) {
            if (!hs.containsKey(key))
                return key;
        }
        return null;
    }

    public static void main(String arg[]) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Mumbai", "Bengaluru");
        tickets.put("Bengaluru", "Delhi");
        tickets.put("Delhi", "Chennai");
        tickets.put("Chennai", "Kolkata");

        String start = getstart(tickets);
        System.out.print( start);

        for (String key : tickets.keySet()) {
            System.out.print("-> " + tickets.get(start));
            start = tickets.get(start);
        }
    }

}
