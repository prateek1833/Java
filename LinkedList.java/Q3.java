import java.util.*;

public class Q3 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addLast(int data) {
        Node NewNode = new Node(data);
        size++;
        if (head == null) {
            head = NewNode;
            tail = NewNode;
            NewNode.next = null;
            return;
        }
        tail.next = NewNode;
        tail = NewNode;
        NewNode.next = null;
    }

    public Node swap(int key1, int key2) {
        if (key1 == key2 || head == null) {
            return head;
        }
        Node temp1 = head;
        Node B1 = null;
        Node temp2 = head;
        Node B2 = null;

        while (temp1 != null && temp1.data != key1 ) {
            B1 = temp1;
            temp1 = temp1.next;
        }
        while ( temp2 != null && temp2.data != key2) {
            B2 = temp2;
            temp2 = temp2.next;
        }
        if (temp1 == null || temp2 == null) {
            return head; // One or both keys not found
        }
        B1.next = temp2;
        B2.next = temp1;

       

        Node temp = temp2.next;
        temp2.next = temp1.next;
        temp1.next = temp;

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

    public static void main(String arg[]) {
        Q3 LL = new Q3();
        LL.addLast(1);
        LL.addLast(2);
        LL.addLast(3);
        LL.addLast(4);
        LL.print();
        LL.swap(2, 4);
        LL.print();

    }

}
