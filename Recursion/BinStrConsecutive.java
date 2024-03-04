public class BinStrConsecutive {
    public static void Binary(int n, char Last, String s) { //print all the binary no. of length n without consecutive ones
        if(n==0){
            System.out.print(s +"\n");
            return;
        }
        if (Last == '0') {
            Binary(n - 1, '0', s + "0");
            Binary(n - 1, '1', s + "1");
        } else {
            Binary(n - 1, '0', s + "0");
        }
    }
    public static void main(String arg[]){
        String s=" ";
        Binary(3, '0', s);
    }
}