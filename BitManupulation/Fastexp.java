// package BitManupulation;

public class Fastexp {
    public static int Fast(int n, int a) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String arg[]) {
        System.out.print(Fast(3, 5));
    }
}
