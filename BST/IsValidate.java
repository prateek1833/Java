import java.util.ArrayList;

public class IsValidate {
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

    public static Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        } else if (root.data > value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    
    public static Boolean ValidateBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        else if(max!=null && root.data>=max.data){
            return false;
        }
        return ValidateBST(root.left, null, root) && ValidateBST(root.right, root, null);
       
    }
    public static Node Mirror(Node root){
        if (root==null){
            return null;
        }
        Node left=Mirror(root.left);
        Node right=Mirror(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
    public static Node BalancedBST(Node root,int start,int end,int a[]){
        int mid=(start+end)/2;
        root=new Node(a[mid]);
        root.left=BalancedBST(root.left, start, mid, a);
        root.right=BalancedBST(root.right, mid, end, a);
        return root;
    }

    public static void main(String[] args) {
        int value[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14  };
        Node root = null;
        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }
        inorder(root);
        System.out.println();
        System.out.println((ValidateBST(root, null, null)));
        Mirror(root);
        inorder(root);
    }
}
