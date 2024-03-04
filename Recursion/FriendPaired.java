public class FriendPaired {    //Friend Pairing Problem
    public static int Friend(int n){
        if(n==1 || n==2){
            return n;
        }
        return Friend(n-1)+(n-1)*Friend(n-2);
        // (single + (n-1)remaining) + (paired(n-1)ways+(n-2)remaining)
        //
    } 
    public static void main(String arg[]){
        System.out.print(Friend(3));

    }
}
