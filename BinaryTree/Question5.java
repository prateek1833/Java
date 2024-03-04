import java.util.*;

public class Question5 {
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

        
    }
    static int max=0;
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int left=sum(root.left);
        int right=sum(root.right);
        int sum=root.data+left+right;
        max=Math.max(sum,max);
        return sum;
    }

    public static void main(String arg[]) {
        int a[] = { -10, 9, -1, -1, 20, 15, -1, -1,  7,-1, -1,};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(a);
        sum(root);
        System.out.println("Maximum sum of a subtree: " + max);

        
    }

}


