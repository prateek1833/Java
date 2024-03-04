import java.util.*;

public class Sorting {
    public static void main(String arg[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5); // add element
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(9);
        System.out.print(list + "\n");

        Collections.sort(list);          //ascending
        System.out.print(list + "\n");

        Collections.sort(list,Collections.reverseOrder());          //descending
        System.out.print(list + "\n");

        

    }
}