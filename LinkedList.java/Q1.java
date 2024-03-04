public class Q1 {
    public static class Node{
        int data;
        Node next;
        public Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head1;
    public static Node head2;

    public Node intersection(Node head1,Node head2) {
        while(head1!=null){
            Node temp=head2;
            while(temp!=null){
                if(head1==temp){
                    return head1;
                }
                temp=temp.next;
            }
            head1=head1.next;
        }
        return null;
    }
    public static void main(String args[]){
        Q1 Y=new Q1();
        Y.head1=new Node(1);
        Y.head1.next=new Node(2);
        Y.head1.next.next=new Node(3);
        Y.head1.next.next.next=new Node(6);
        Y.head1.next.next.next.next=new Node(7);
        Y.head1.next.next.next.next.next=null;
        Y.head2=new Node(4);
        Y.head2.next=new Node(5);
        Y.head2.next.next=Y.head1.next.next.next;

        Node inter=Y.intersection(head1, head2);
        System.out.print(inter.data);

    }
    
}

