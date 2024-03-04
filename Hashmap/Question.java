import java.util.HashMap;


public class Question {
    public static void main(String arg[]) {
        {
            int a[] = { 2, 7, 11, 15, -2 }; // Question 2
            int tar = 9;
            int m = 0, n = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < a.length; i++) {
                if (map.containsKey(tar - a[i])) {
                    System.out.println("[" + i + "," + map.get(tar - a[i]) + "]");
                } else {
                    map.put(a[i], i);
                }
            }
        }
      
    }

}
