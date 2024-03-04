import java.rmi.ConnectIOException;
import java.util.*;

public class height {
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
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int left=height(root.left);
            int right=height(root.right);
            return Math.max(left, right)+1;
        }
        
        public static int CountNode(Node root){
            if(root==null){
                return 0;
            }
            
            int left=CountNode(root.left);
            int right=CountNode(root.right);
            return left+right+1;
        }
        public static int SumNode(Node root){
            if(root==null){
                return 0;
            }
            
            int left=SumNode(root.left);
            int right=SumNode(root.right);
            return left+right+root.data;
        }


    }

    public static void main(String arg[]) {
        int a[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(a);
        System.out.println("root = "+root.data);
        System.out.println("height = "+tree.height(root));
        System.out.println("count = "+tree.CountNode(root));
        System.out.println("sum of nodes = "+tree.SumNode(root));
        
    }

}
