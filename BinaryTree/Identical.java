import java.rmi.ConnectIOException;
import java.util.*;

public class Identical {
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

        public static boolean isIdentical(Node node,Node subroot){
            if(node==null && subroot==null){
                return true;
            }
            else if(node==null || subroot==null || node.data!=subroot.data){
                return false;
            }

            if(!isIdentical(node.left, subroot.left)){
                return false;
            }
            if(!isIdentical(node.right, subroot.right)){
                return false;
            }
            return true;
        }

        public static boolean issubtree(Node root,Node subroot){
            if(root==null){
                return false;
            }
            if(root.data==subroot.data){
                if (isIdentical(root,subroot)){
                    return true;
                }
            }
            Boolean ans= issubtree(root.left, subroot) || issubtree(root.right, subroot);
            return ans;
        }


    }

    public static void main(String arg[]) {
        int a[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(a);
        int a2[] = {  2, 4, -1, -1, 5, -1, -1 };
        BinaryTree tree2 = new BinaryTree();
        tree2.idx = -1;
        Node subroot = tree2.buildtree(a2);
        System.out.print(tree.issubtree(root,subroot));
        
        
        
    }

}

