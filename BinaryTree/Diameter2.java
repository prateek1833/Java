import java.rmi.ConnectIOException;
import java.util.*;

public class Diameter2 {
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

        static class Info{
            int dia;
            int ht;
            public Info(int dia,int ht){
                this.dia=dia;
                this.ht=ht;
            }
        }

        public static Info diameter(Node root){
            if(root==null){
                return new Info(0,0);
            }

            Info leftInfo=diameter(root.left);
            Info rightInfo=diameter(root.right);
            int dia = Math.max(Math.max(leftInfo.dia, rightInfo.dia), leftInfo.ht + rightInfo.ht+1);
            int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
            return new Info(dia,ht);
        }
        
        


    }

    public static void main(String arg[]) {
        int a[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(a);
        
        System.out.println("Diameter = "+tree.diameter(root).dia);
        
        
    }

}

