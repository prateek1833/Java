public class Question {
    public static class Node {
        int data;
        Node right;
        Node left;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static int sum = 0;

    public static int PrintSum(Node root, int L, int R) { // Question 1
        if (root == null) {
            return 0;
        }
        if (root.data >= L && root.data <= R) {
            PrintSum(root.left, L, R);
            sum += root.data;
            PrintSum(root.right, L, R);
        }
        if (root.data < L) {
            return PrintSum(root.right, L, R);
        } else if (root.data > R) {
            return PrintSum(root.left, L, R);
        }
        return sum;
    }

    public static int minDiff = Integer.MAX_VALUE;   //Question 2
    public static Node Cnode = null;

    public static void Closest(Node root, int key) {
        if (root == null) {
            return;
        }
        int diff = Math.abs(root.data - key);
        if (diff < minDiff) {
            minDiff = diff;
            Cnode = root;
        }
        if (key > root.data) {
            Closest(root.right, key);
        } else {
            Closest(root.left, key);
        }

    }

    public static int count = 0;

    public static Node kSmallest(Node root, int k) { // IMPORTANT , Question 3
        if (root == null) {
            return null;
        }
        Node left = kSmallest(root.left, k); // Left
        if (left != null) {
            return left;
        }
        count++;
        if (count == k) { // Node
            return root;
        }
        return kSmallest(root.right, k); // Right
    }

    public static int Sum = 0; // Question 4

    public static void SumOfGreatNode(Node root) {
        if (root == null) {
            return;
        }
        SumOfGreatNode(root.right);
        int temp = root.data;
        root.data = Sum;
        Sum += temp;
        SumOfGreatNode(root.left);
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static class Info { // Question 5
        Boolean isVal;
        int min;
        int max;
        int sum;

        public Info(Boolean isVal, int min, int max, int sum) {
            this.isVal = isVal;
            this.min = min;
            this.max = max;
            this.sum = sum;
        }
    }

    public static int maxSum = 0;

    public static Info MaxSum(Node root) {
        if (root == null) {
            return new Info(true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }
        Info left = MaxSum(root.left);
        Info right = MaxSum(root.right);
        int min = Math.min(root.data, Math.min(left.min, right.min));
        int max = Math.max(root.data, Math.max(left.max, right.max));
        int sum = left.sum + root.data + right.sum;
        if (root.data <= left.max || root.data >= right.min) {
            return new Info(false, min, max, sum);
        } else if (left.isVal && right.isVal) {
            maxSum = Math.max(sum, maxSum);
            return new Info(true, min, max, sum);
        }
        return new Info(false, min, max, sum);

    }

    public static void main(String arg[]) {
        Node root1 = new Node(8);
        root1.left = new Node(5);
        root1.left.left = new Node(3);
        root1.left.right = new Node(6);
        root1.right = new Node(11);
        root1.right.right = new Node(20);
        // System.out.println(PrintSum(root, 5, 20));
        // System.out.print(kSmallest(root, 5).data);
        // preorder(root);
        // System.out.println();
        // SumOfGreatNode(root);
        // preorder(root);

        Node root2 = new Node(5);
        root2.left = new Node(9);
        root2.left.left = new Node(6);
        root2.left.left.left = new Node(8);
        root2.left.left.right = new Node(7);
        root2.right = new Node(2);
        root2.right.right = new Node(3);

        // Info a = MaxSum(root2);
        // System.out.println(maxSum);

        Closest(root1, 12);
        System.out.println(minDiff);
        System.out.println(Cnode.data);
    }

}
