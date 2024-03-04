import java.rmi.ConnectIOException;
import java.util.*;

public class KthLevel {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            Node left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {
        static int idx = -1;

        public static Node buildtree(int a[]) {
            idx++;
            if (a[idx] == -1) {
                return null;
            }
            Node newNode = new Node(a[idx]);
            newNode.left = buildtree(a);
            newNode.right = buildtree(a);
            return newNode;
        }
        public static void Kth(Node root,int level,int k){
            if(root==null){
                return;
            }
            if(k==level){
                System.out.print(root.data+" ");
            }
            Kth(root.left, level+1, k);
            Kth(root.right, level+1, k);
        }


    }

    public static void main(String arg[]) {
        int a[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(a);
        System.out.println("root = "+root.data);
        tree.Kth(root, 1, 3);
        
        
    }

}
