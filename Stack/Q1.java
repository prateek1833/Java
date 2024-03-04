import java.util.LinkedList;    // wrong code
import java.util.Stack;

public class Q1 {
    public static class Node {
        char data;
        Node next;

        public Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;


    public static int size(Node head){
        Node temp=head;
        int i=0;
        while(temp!=null){
            i++;
            temp=temp.next;
        }
        return i;
    }



    public static boolean palindrome(Node LL) {
        Stack<Character> s = new Stack<>();
        


        if(size(LL)%2==0){
            Node temp=LL;
            while (temp != null) {
            char ch = temp.data;
            if (!s.isEmpty() && ch == s.peek()) {
                s.pop();
            } else {
                s.push(ch);
            }
            temp=temp.next;
        }

        return s.isEmpty() ;
        }
        else{
            Node i=head;
            Node slow=head;
            Node fast=head.next;
            while(fast!=null && fast.next!=null){
                i=slow;
                slow=slow.next;
                fast=fast.next.next;
            }
            i.next=i.next.next;
            Node temp=head;
            while (temp != null) {
            char ch = temp.data;
            if (!s.isEmpty() && ch == s.peek()) {
                s.pop();
            } else {
                s.push(ch);
            }
            temp=temp.next;
        }
        return s.isEmpty() ;
        }
    }
  

    public static void main(String arg[]) {
        Q1 ll = new Q1();
        ll.head = new Node('A');
        ll.head.next = new Node('B');
        ll.head.next.next = new Node('C');
        ll.head.next.next.next = new Node('B');
        ll.head.next.next.next.next = new Node('A');
        System.out.print(palindrome(head));
    
    }
}