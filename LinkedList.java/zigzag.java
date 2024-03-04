import java.util.*;

public class zigzag {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;

    public Node ZigZag(Node lefthead) {
        // find mid
        Node righthead;
        Node fast = lefthead.next;
        Node slow = lefthead;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse second half
        Node curr = mid.next;
        mid.next = null;
        Node next;
        Node prev = mid;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        righthead = prev;


        // alternate
        Node nextL;
        Node nextR;
        while (lefthead != null && righthead != null) {
            nextL = lefthead.next;
            lefthead.next = righthead;
            nextR = righthead.next;
            righthead.next = nextL;

            lefthead = nextL;
            righthead = nextR;
        }
        return head;
    }
    public static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.print("\n");
    }

    public static void main(String args[]) {
        zigzag zz = new zigzag();
        zz.head = new Node(4);
        zz.head.next = new Node(5);
        zz.head.next.next = new Node(6);
        zz.head.next.next.next = new Node(7);
        zz.head.next.next.next.next = new Node(8);
        zz.head.next.next.next.next.next = new Node(9);
        zz.print();
        zz.head=zz.ZigZag(head);
        zz.print();
    }
}
