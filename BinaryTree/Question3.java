import java.util.*;

public class Question3 {
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
        public static Node DeleteLeaf(Node root,int x){
            if(root==null){
                return null;
            }
            root.left=DeleteLeaf(root.left, x);
            root.right=DeleteLeaf(root.right, x);
            if( root.left==null && root.right==null && root.data==x){
                
                return null;
            }
            return root;
        }

    }

    public static void main(String arg[]) {
        int a[] = { 1, 3, 3, -1, -1, 2, -1, -1, 3,  -1, -1,};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(a);
        root=tree.DeleteLeaf(root, 3);
        tree.preorder(root);
    }

}

