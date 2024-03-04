import java.util.*;

public class Question1 {
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

        public static void preorder(Node root) {
            if (root == null) {
                System.out.println(-1);
                return;
            }
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }

        public static Boolean univalued(Node root){
            int data=root.data;
            Boolean A=UN(root, data);
            return A;
        }
        public static Boolean UN(Node root,int data){
            if(root==null){
                return true;
            }
            Boolean left= UN(root.left,data);
            Boolean right=UN(root.right,data);

            if(left==true && right ==true && root.data==data){
                return true;
            }

            return false;
        }

        

    }

    public static void main(String arg[]) {
        int a[] = { 2, 2, 2, -1, -1, 2, -1, -1, 2, 2, -1, -1, 2, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(a);
        // tree.preorder(root);
        System.out.print(tree.univalued(root));
    }

}
