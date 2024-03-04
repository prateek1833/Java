import java.util.*;

public class checkpalin {
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

    public void addfirst(int data) {
        Node NewNode = new Node(data);
        size++;
        if (head == null) {
            head = NewNode;
            tail = NewNode;
            NewNode.next = null;
            return;
        }
        NewNode.next = head;
        head = NewNode;
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean palindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node mid = findMid(head);
        Node curr = mid;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;

        while ( right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String args[]) {
        checkpalin ll = new checkpalin(); // n the main method, an instance(ex.-dish) of the LL class(ex.-recipe) is
                          // created.
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        // ll.print();
        System.out.print(ll.palindrome());
    }

}