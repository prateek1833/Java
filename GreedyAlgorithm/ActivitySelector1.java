
import java.util.*;

public class ActivitySelector1 {
    public static void main(String arg[]) {
        int start[] = { 0, 1, 3, 5, 5, 8 };
        int end[] = { 6, 2, 4, 7, 9, 9 };
        ArrayList<Integer> a = new ArrayList<>();
        int maxAct = 0;
        int Activity[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            Activity[i][0] = i;
            Activity[i][1] = start[i];
            Activity[i][2] = end[i];
        }
        Arrays.sort(Activity, Comparator.comparingDouble(o -> o[2]));  //lamda function
        
        // First activity
        maxAct = 1;
        a.add(Activity[0][0]);

        int lastend = Activity[0][2];
        for (int i = 1; i < end.length; i++) {

            if (Activity[i][1] >= lastend) {
                maxAct++;
                a.add(Activity[i][0]);
                lastend = Activity[i][2];
            }
        }
        System.out.println("Max Activity=" + maxAct);

        for (int i = 0; i < a.size(); i++) {
            System.out.println("A" + a.get(i));
        }
    }

}
