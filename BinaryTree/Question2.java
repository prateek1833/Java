import java.util.*;

public class Question2 {
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

        public static Boolean Mirror(Node T,Node M){
            if(T==null && M==null ){
                return true;
            }

            Boolean left=Mirror(T.left, M.right);
            Boolean right=Mirror(T.right, M.left);
            if(left==true && right ==true && T.data==M.data){
                return true;
            }
            return false;
            
        }
    }

    public static void main(String arg[]) {
        int a[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        int b[] = { 1, 3, 7, -1, -1, 6, -1, -1, 2, 5, -1, -1, 4, -1, -1 };
        BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();
        Node T = tree1.buildtree(a);
        Node M = tree2.buildtree(b);
        System.out.print(tree1.Mirror(T,M));
        
    }

}
