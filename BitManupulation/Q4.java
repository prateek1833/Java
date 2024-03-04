//           A--> 1000001
//          ' '-->0100000
// |of(A,' ') --> 1100001 --> 'a'
public class Q4 {
    public static void main(String arg[]) {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print((char)(c | ' '));
        }
    }

}
