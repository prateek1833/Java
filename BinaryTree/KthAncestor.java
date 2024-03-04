import java.rmi.ConnectIOException;
import java.util.*;

public class KthAncestor {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
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
        public static int KAncestor(Node root,int n,int k){
            if(root==null){
                return -1;
            }
            if(root.data==n){
                return 0;
            }

            int left=KAncestor(root.left, n, k);
            int Right=KAncestor(root.right, n, k);

            if(left==-1 && Right==-1){
                return -1;
            }
            int max=Math.max(left, Right);
            if(max+1==k){
                System.out.println(root.data);
            }
            return max+1;
        }

    }

    public static void main(String arg[]) {
        int a[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(a);
        System.out.println("root = "+root.data);
        System.out.println("KthAncestor = "+tree.KAncestor(root, 5, 2));
        

    }
}

