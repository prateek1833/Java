import java.util.*;

public class checkCircle {
    public static class Node {
        int data;
        Node next; // In Java, when you declare a variable like Node next;,
        // you're creating a reference variable named next that can hold a reference to
        // an instance of the Node class.

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static boolean Circle() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.print("\n");
    }

    public static void removeCycle(){
        //identify cycle
        Node fast=head;
        Node slow=head;
        Node prev=null;
        boolean cycle=false;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(!cycle){
            return;
        }

        //find meeting point 
        
            slow=head;
            while(fast!=slow){
                prev=fast;
                fast=fast.next;
                slow=slow.next;
            }
        

        //remove cycle
        prev.next=null;
    }

    public static void main(String args[]) {

        head = new Node(1);
        Node temp=new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp; // Make the last node point back to the head
        System.out.print(Circle());
        System.out.print("\n");
        removeCycle();
        System.out.print(Circle());
    }
    
}