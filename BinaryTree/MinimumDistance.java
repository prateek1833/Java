import java.rmi.ConnectIOException;
import java.util.*;

public class MinimumDistance {
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
        public static int Dis(Node root,int n){
            if(root==null){
                return -1;
            }
            if (root.data==n){
                return 0;
            }
            int leftDis=Dis(root.left,n);
            int RightDis=Dis(root.right,n);

            if(leftDis==-1 && RightDis==-1){
                return -1;
            }
            else if(leftDis==-1){
                return RightDis+1;
            }
            else{
                return leftDis+1;
            }
        }
       

        public static int MinDis(Node root,int n1,int n2){
            Node LCA=lca2(root, n1, n2);
            int left=Dis(LCA,n1);
            int right=Dis(LCA,n2);
            return left+right;
        }

        
        public static Node lca2(Node root,int n1,int n2){
            if(root==null || root.data==n1 || root.data==n2){
                return root;
            }
            Node leftans=lca2(root.left, n1, n2);
            Node rightans=lca2(root.right, n1, n2);

            if(leftans==null){
                return rightans;
            }
            if(rightans==null){
                return leftans;
            }

            return root;
        }

    }

    public static void main(String arg[]) {
        int a[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(a);
        System.out.println("root = "+root.data);
        System.out.println("LCA = "+tree.lca2(root, 2, 6).data);
        System.out.println("Minimum Distance = "+tree.MinDis(root, 2, 6));

    }
}
