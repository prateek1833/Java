import java.util.*;

public class Operation {
    public static void main(String arg[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // add element
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.print(list + "\n");

        System.out.print(list.get(3) + "\n"); // get element

        list.remove(2); // remove element
        System.out.print(list + "\n");

        list.set(1, 9); // set element 9 at index 1
        System.out.print(list + "\n");

        System.out.print(list.contains(4) + "\n"); // contains element
        System.out.print(list.contains(11) + "\n");

        System.out.print(list.size()+"\n"); // size of element
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}