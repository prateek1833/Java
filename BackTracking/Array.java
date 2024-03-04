// package BackTracking;

public class Array {
    public static void A(int a[], int i, int val) {
        // Base Case
        if (i == a.length) {
            print(a);
            return;
        }

        // Kaam
        a[i] = val;
        A(a, i + 1, val + 1);
        a[i] -= 2;

    }

    public static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int a[] = new int[5];
        A(a, 0, 1);
        print(a);
    }

} //TC=O(n)
//SC=O(n)
