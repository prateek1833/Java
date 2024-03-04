// package String;
import java.util.*;
public class Palindrome {
    public static boolean palin(String s){
        for(int i=0;i<(s.length())/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){ // Remember charAt bracket is () not []
                return false;
            }
        }
        return true;
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String inp=sc.next();
        // palin(inp);
        System.out.print(palin(inp));
    }

    
}
