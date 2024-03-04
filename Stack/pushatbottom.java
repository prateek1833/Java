import java.util.*;
public class pushatbottom {

    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String s){  //reversing a string using stack
        Stack <Character> c=new Stack<>();
        int idx=0;
        while(idx<s.length()){
            c.push(s.charAt(idx));
            idx++;
        }
        StringBuilder sb=new StringBuilder();

        while(!c.isEmpty()){
            sb.append(c.pop());
        }
        s=sb.toString();
        return s;
    }
    public static void main(String arg[]){
        Stack <Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s, 4);
        while(!s.isEmpty()){
            System.out.print(s.pop());
            System.out.print("\n");
        }

        String p="abc";
        System.out.print(reverseString(p));

        
    }
}
