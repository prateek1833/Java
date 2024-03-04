public class LLimplementation {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    public static class queue {
        public static Node head=null;
        public static Node tail=null;
        static int front;
        static int rear;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }
        public static void add(int data) {
            Node newNode =new Node(data);
            if (head==null && tail==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.print("Queue is Empty");
                return -1;
            }
            front =head.data;
             if(head==tail){
                head=tail=null;
            }
            else{
                head=head.next;
            }
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.print("Queue is Empty");
                return -1;
            }
            front=head.data;
            return front;
        }

    }

    public static void main(String arg[]) {
        queue q=new queue();
        q.add(5);
        q.add(4);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}