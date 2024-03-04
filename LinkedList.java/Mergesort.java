import java.util.*;

public class Mergesort {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public Node getmid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast.next != null && fast != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }}
            while(head1!=null){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            while(head2!=null){
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        
        return mergedLL.next;
    }

    public Node mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getmid( head);
        Node righthead = mid.next;
        mid.next = null;
        Node lefthead = head;
        righthead=mergesort(righthead);
        lefthead =mergesort(lefthead);
        return merge(lefthead, righthead);

    }
    public void addfirst(int data) {
        Node NewNode = new Node(data);
        
        if (head == null) {
            head = NewNode;
            tail = NewNode;
            NewNode.next = null;
            return;
        }
        NewNode.next = head;
        head = NewNode;
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
    public static void main(String arg[]){
        Mergesort mergesort = new Mergesort();
        mergesort.head = new Node(5);
        mergesort.head.next = new Node(7);
        mergesort.head.next.next = new Node(2);
        mergesort.head.next.next.next = new Node(9);

        System.out.println("Original linked list:");
        mergesort.print();

        mergesort.head = mergesort.mergesort(mergesort.head); 

        System.out.println("Sorted linked list:");
        mergesort.print();
    }

}
