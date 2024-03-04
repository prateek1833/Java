import java.util.*;

public class Q2 {
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

    public Node Del(int M, int N) {
        Node temp = head;
        while (M > 1) {
            temp = temp.next;
            M--;
        }
        while (N > 0 && temp.next!=null) {
            temp.next = temp.next.next;
            N--;
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

    public static void main(String arg[]) {
        Q2 delete = new Q2();
        delete.addLast(1);
        delete.addLast(2);
        delete.addLast(3);
        delete.addLast(4);
        delete.addLast(5);
        delete.addLast(6);
        delete.addLast(7);
        delete.addLast(8);
        delete.print();
        delete.Del(3, 2);
        delete.print();
    }

}
