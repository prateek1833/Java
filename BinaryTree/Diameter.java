import java.rmi.ConnectIOException;
import java.util.*;

public class Diameter {
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
        public static int diameter(Node root){ //O(N^2)
            if(root==null){
                return 0;
            }
            int leftDia=diameter(root.left);
            int leftheight=height(root.left);
            int rightheight=height(root.right);
            int rightDia= diameter(root.right);
            return Math.max(Math.max(leftDia, rightDia),(leftheight+rightheight+1));
        }
  
    }

    public static void main(String arg[]) {
        int a[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(a);
        System.out.println("root = "+root.data);
        System.out.println("height = "+tree.height(root));
        System.out.println("Diameter = "+tree.diameter(root));
        
        
    }

}

