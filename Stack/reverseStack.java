import java.util.Stack;

public class reverseStack {

    public static void pushAtBottom(Stack <Integer> s, int data){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void revStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int top=s.pop();
        revStack(s);
        pushAtBottom(s, top);

    }


    public static void main(String arg[]){
        Stack <Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        
        revStack(s);
        while(!s.isEmpty()){
            System.out.print(s.pop());
            System.out.print("\n");
        }
        
        
    }   
}
