import java.rmi.ConnectIOException;
import java.util.*;

public class LCA {
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
        public static boolean getpath(Node root,int n,ArrayList<Node> a){
            if(root==null){
                return false;
            }
            a.add(root);

            if(root.data==n){
                return true;
            }
            Boolean foundleft =getpath(root.left , n, a);
            Boolean foundright=getpath(root.right, n, a);
            if(foundleft || foundright){
                return true;
            }
            a.remove(a.size()-1);
            return false;
        }

        public static void lca(Node root,int n1,int n2){
            ArrayList<Node> a1=new ArrayList<>();
            ArrayList<Node> a2=new ArrayList<>();

            getpath( root, n1, a1);
            getpath( root, n2, a2);

            int i;
            for( i=0;i<a1.size() && i<a2.size();i++){
                if(a1.get(i)!=a2.get(i)){
                    break;
                }
            }
            Node lca=a1.get(i-1);
            System.out.println(lca.data);
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
        // tree.lca(root, 4, 6);
        System.out.println("LCA = "+tree.lca2(root, 3, 6).data);
        
    }

}
