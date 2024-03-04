public class Q4 {
    public static class Node {
        int data;
        Node next;
        private Node(int data){
            this.data=data;
            this.next=null;
        }
        private Node(){
            this.next=null;
        }
    }
    public static Node head;

    public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data);
            System.out.print("-->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.print("\n");
    }

    public Node EO(Node head){
        Node temp1=new Node();
        Node temp2=new Node();
        Node head2=temp2;
        Node head1=temp1;
        Node temp=head;
        while(temp!=null ){
            if(temp.data%2==0){
                temp1.next=temp;
                temp1=temp1.next;
            }
            else{
                temp2.next=temp;
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        temp1.next=head2;
        temp2.next=null;
        return head1;
    }

    public static void main(String args[]){
        Q4 evenodd=new Q4();
        evenodd.head=new Node(8);
        evenodd.head.next=new Node(12);
        evenodd.head.next.next=new Node(10);
        evenodd.head.next.next.next=new Node(5);
        evenodd.head.next.next.next.next=new Node(4);
        evenodd.head.next.next.next.next.next=new Node(1);
        evenodd.head.next.next.next.next.next.next=new Node(6);
        evenodd.print();
        evenodd.EO(head);
        evenodd.print();
        
    }
    
}
