import java.util.*;

public class Transform {
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

        public static int transform(Node root) {
            if (root == null) {
                return 0;
            }
            int left = transform(root.left);
            int right = transform(root.right);

            int data = root.data;
            root.data = left + right;
            return root.data + data;
        }

    }

    public static void main(String arg[]) {
        int a[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(a);
        tree.transform(root);
        tree.preorder(root);

    }

}
