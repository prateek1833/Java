import java.util.*;

public class Intro {
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

        public static void inorder(Node root) {
            if (root == null) {
                System.out.println(-1);
                return;
            }
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }

        public static void postorder(Node root) {
            if (root == null) {
                System.out.println(-1);
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data+" ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String arg[]) {
        int a[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(a);
        // System.out.println(root.data);
        tree.levelOrder(root);
    }

}
