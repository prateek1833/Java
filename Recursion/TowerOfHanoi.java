public class TowerOfHanoi { // Tower of hanoi problem
    public static void Transfer(String s,String h, String d,int n){
        if(n==0){
            return ;
        }
        Transfer(s, d, h, n-1);
        System.out.print("Transfer "+n+" from "+s+" to "+d+"\n");
        Transfer(h, s, d, n-1);
    }
    public static void main(String arg[]){
        String s=new String("Source");
        String h=new String("Helper");
        String d=new String("destination");
        Transfer(s, h, d, 7);
    }
    
}
// T(n)=2T(n-1)+1
// T(n-1)=2T(n-2)+1
// T(n-2)=2T(n-3)+1

// T(n)=2^xT(n-x)+2^(x-1)+2^(x-2)+2^(x-3)-. . . .
// Let x =n-1
// T(n)=2^(n-1)T(1)-2^(n-2)-2^(n-3)-2^(n-4)-2^(n-5)-2^(n-6)+....
// T(n)=2^n-1
// T(n)~2(n) Time complexity


