
// package String;
import java.util.*;
public class inpout {
    public static void print(String s){
        for( int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }

    }
    public static void main(String arg[]){
        String str ="abdd";
        String str1=new String("Bahubali");
        Scanner sc=new Scanner(System.in);
        String name =sc.nextLine(); // for line input
        System.out.print(name+" "+str1+" "+str+"\n");
        System.out.print(name.length()+"\n");//in array .length was propert here .length() is a function
        String fullname=name+" "+str1; //concatination
        System.out.print(fullname+"\n");
        System.out.print(str1.charAt(0)+"\n");
        print(name);
    }
    
}
