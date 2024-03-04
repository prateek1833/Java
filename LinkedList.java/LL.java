import java.util.*;

public class LL {
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

    public void addmiddle(int idx, int data) {
        int i = 0;
        if (idx == 0) {
            addfirst(data);
            return;
        }
        Node NewNode = new Node(data);
        size++;
        Node temp = head;
        while (i != idx - 1) {
            temp = temp.next;
            i++;
        }
        NewNode.next = temp.next;
        temp.next = NewNode;
    }

    public void addlast(int data) {
        Node NewNode = new Node(data);
        size++;
        if (head == null) {
            NewNode = head;
            NewNode = tail;
            NewNode.next = null;
            return;
        }
        tail.next = NewNode;
        tail = NewNode;
        NewNode.next = null;
    }

    public int removefirst() {
        if (size == 0) {
            System.out.print("Linked List is empty\n");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;

    }

    public int removelast() {
        if (size == 0) {
            System.out.print("Linked List is empty\n");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        Node prev = head;
        while (prev.next != tail) {
            prev = prev.next;
        }
        int value = tail.data;
        prev.next = null;
        prev = tail;
        size--;
        return value;
    }

    public int search(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                System.out.print("\nkey  present at index = ");
                return i;
            } else {
                temp = temp.next;
                i++;
            }
        }
        System.out.print("\nkey doesnt present");
        return -1;
    }

    public int helper(int key, Node head) {
        if (head == null)
            return -1;

        int idx = helper(key, head.next);
        if (head.data == key) {
            return 0;
        }
        if (idx == -1) {
            return -1;
        }
        return idx + 1;

    }

    public int recSearch(int key) {
        System.out.print("\nkey  present at index = ");
        return helper(key, head);
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
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void deleteNthfromEnd(int n){
        Node temp=head;
        int sz=0;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(sz==n){
            head=head.next;
            return;
        }
        temp=head;
        for(int i=1;i<sz-n;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return;
    }
     

    public static void main(String args[]) {
        LL ll = new LL(); // n the main method, an instance(ex.-dish) of the LL class(ex.-recipe) is
                          // created.
        ll.addfirst(5);
        ll.addfirst(8);
        ll.addfirst(3);
        ll.addlast(9);
        ll.addlast(4);
        ll.addmiddle(3, 11);
        // System.out.print("removed element = " + ll.removefirst() + "\n");
        // System.out.print("removed element = " + ll.removelast() + "\n");
        ll.print();
        // System.out.print("\nsize = " + ll.size);
        // System.out.print(ll.recSearch(11));
        ll.reverse();
        ll.print();
        ll.deleteNthfromEnd(3);
        ll.print();
    }
}
