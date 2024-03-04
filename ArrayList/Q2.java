import java.util.*;

public class Q2 {
    public static void lonely(ArrayList<Integer> A) {

        for (int i = 0; i < A.size(); i++) {
            int count = 0;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(i) + 1 == A.get(j) || A.get(i) - 1 == A.get(j))
                    count = 1;

            }
            if (count == 0) {
                System.out.print(A.get(i) + "\n");
            }
        }
    }

    public static void main(String arg[]) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(10);
        A.add(5);
        A.add(6);
        A.add(8);
        lonely(A);
    }
}
