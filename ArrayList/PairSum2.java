import java.util.*;

// Find a pair whose sum is equal to target
public class PairSum2 {
    public static Boolean Brute_Force(ArrayList<Integer> A, int target) {
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if (A.get(i) + A.get(j) == target)
                    return true;
            }
        }
        return false;
    }

    public static Boolean pointer(ArrayList<Integer> A, int target) {
        int n = A.size();
        int bp = -1;
        for (int i = 0; i < n - 1; i++) {
            if (A.get(i) > A.get(i + 1))
                bp = i;
        }
        int lp = bp + 1;
        int rp = bp;
        while (lp != rp) {
            if (A.get(lp) + A.get(rp) == target)
                return true;
            else if (A.get(lp) + A.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n - 1 + rp) % n;
            }
        }
        return false;

    }

    public static void main(String arg[]) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(11);
        A.add(15);
        A.add(6);
        A.add(8);
        A.add(9);
        A.add(10);
        // System.out.print(Brute_Force(A, 7));
        System.out.print(pointer(A, 16));
    }
}