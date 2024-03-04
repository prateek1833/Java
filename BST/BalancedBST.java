import java.util.ArrayList;

public class BalancedBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }


    public static Node BalancedBST(int start,int end,int a[]){
        if(start > end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(a[mid]);
        root.left=BalancedBST( start, mid-1, a);
        root.right=BalancedBST( mid+1, end, a);
        return root;
    }

    public static void main(String[] args) {
        int value[] = { 1,3,5,7,9,11,13 };
        Node root=BalancedBST( 0, value.length-1, value);
        preorder(root);
    }
}
