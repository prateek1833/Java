import java.util.ArrayList;

public class buildaBST {
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

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        } else if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node delete(Node root, int value) {
        if (root.data > value) {
            root.left = delete(root.left, value);
        } else if (root.data < value) {
            root.right = delete(root.right, value);
        } else {
            // case 1 & 2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3
            Node IS = Inordersuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node Inordersuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (k1 <= root.data && k2 >= root.data) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (k1 > root.data) {
            printInRange(root.right, k1, k2);
        } else {
            printInRange(root.left, k1, k2);
        }
    }
    public static void root2Leaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            print(path);
        }
        root2Leaf(root.left, path);
        root2Leaf(root.right, path);
        path.remove(path.size()-1);

    }
    public static void print(ArrayList<Integer> path){
        for(int i=0;i<=path.size()-1;i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }
    
    public static Boolean ValidateBST(Node root){
        if(root==null){
            return true;
        }
        Boolean left=ValidateBST(root.left);
        Boolean right=ValidateBST(root.right);
        if(root.left.data>root.data || root.right.data<root.data){
            return false;
        }
        if(left == false || right==false){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int value[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }
        inorder(root);
        System.out.println();
        System.out.print(ValidateBST(root));
    }
}
