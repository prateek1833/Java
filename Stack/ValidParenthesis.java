import java.util.Stack;

public class ValidParenthesis {
    public static boolean VP(String s){
        Stack<Character> t=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' ||ch=='[' ||ch=='{' ){
                t.push(ch);
            }
            else{
                if(t.isEmpty()){
                    return false;
                }
                if(t.peek()=='('&& ch==')' ||
                t.peek()=='{'&& ch=='}'||
                t.peek()=='['&& ch==']'
                ){
                    t.pop();
                }
            }
        }
        if(t.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String arg[]){
        String str="{[(({[{}]}))]}";
        System.out.print(VP(str));

    }
}
