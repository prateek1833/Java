public class Q2 {
    public static void swap(int n, int m) {
        n = n + m;
        m = n - m;
        n = n - m;
        System.out.print(n + "," + m);
    }

    public static void XORswap(int x, int y) {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap: x = " + x + " and y = " + y);
    }

    public static void main(String arg[]) {
        XORswap(5, 10);
    }

}
