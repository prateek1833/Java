// package BitManupulation;

public class BitManu {
    public static void Evenodd(int n) {

        int bitmask = 1;
        if ((n & bitmask) == 0) {
            // Even
            System.out.print("Even Number\n");
        } else {
            System.out.print("Odd Number\n");
        }
    }

    public static void ithbit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            System.out.print("0\n");
        } else
            System.out.print("1\n");
    }

    public static void setithbit(int n, int i) {
        int bitMask = 1 << i;
        System.out.print((n | bitMask)+"\n");

    }
    public static int clearithbit(int n, int i) {
        //Important
        int bitMask = ~(1 << i);
        return((n & bitMask));

    }
    public static void updateithbit(int n, int i,int nb) {
        //Important
        n=clearithbit(n,i);

        int bitMask = nb<<i;
        System.out.print((n | bitMask)+"\n");

    }
    public static void clearIbit(int n, int i) {
        //Important
        // This clear Last i bit of n
        int bitMask = ((~0)<<i);
        System.out.print((n & bitMask)+"\n");

    }
    public static void clearRangeOfbit(int n, int i,int j) {
        //Important
        // This clear Range of bit of n
        // DOUBT
        int bitMask = ((~0)<<(j+1))|(1<<i)-1;
        System.out.print((n & bitMask)+"\n");

    }
    public static boolean isPowerof2(int n){
        return (n&(n-1))==0;
    }
    public static void CountSetBits(int n){
        int count =0;
        while(n>0){
            if((n&1)==1) count++;
            n=n>>1;
        }
        System.out.print(count);
    }

    public static void main(String arg[]) {
        Evenodd(3);
        ithbit(15, 2);
        setithbit(15,4);
        System.out.print(clearithbit(31,4)+"\n");
        updateithbit(15,3,0);
        updateithbit(15,4,1);
        clearIbit(31,3);
        clearRangeOfbit(31,2,4);
        System.out.print(isPowerof2(16)+"\n");
        CountSetBits(15);
    }

}
