import java.util.Stack;

public class LL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public static Node head;

        public static int push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            }
            newNode.next = head;
            head = newNode;
            return head.data;
        }

        static int top = head.data;

        public static int pop() {
            if (head == null) {
                return -1;
            }
            head = head.next;
            return top;
        }

        public static int peek() {
            if (head == null) {
                return -1;
            }
            return top;
        }
    }

    public static void main(String arg[]) {
        Stack s = new Stack();
        s.push(5);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.print(s.peek());
            s.pop();
        }

    }

}
