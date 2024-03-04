import java.util.*;
// Find a pair whose sum is equal to target
public class PairSum1 { 
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
        int lp = 0;
        int rp = A.size() - 1;
        while(lp!=rp){
        if (A.get(lp) + A.get(rp) == target)
            return true;
        else if (A.get(lp) + A.get(rp) < target) {
            lp++;
        } else {
            rp--;
        }
    }
    return false;

    }

    public static void main(String arg[]) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        // System.out.print(Brute_Force(A, 7));
        System.out.print(pointer(A, 9));
    }
}