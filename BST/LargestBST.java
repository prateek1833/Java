public class LargestBST {
    public static class Node{
        Node left;
        Node right;
        int data;
        public Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    public static class Info {
        Boolean isVal;
        int max;
        int min;
        int size;
        public Info (boolean isVal,int size,int min,int max){
            this.isVal=isVal;
            this.max=max;            
            this.min=min;
            this.size=size;
        }
    }
    static int maxBST=0;
    public static Info larBST(Node root){
        if(root==null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Info left=larBST(root.left);
        Info right=larBST(root.right);
        int min=Math.min(root.data,Math.min(left.min, right.min));
        int max=Math.max(root.data,Math.max(right.max, left.max));
        int size=left.size+right.size+1;

        if(root.data<=left.max || root.data>=right.min){
            return new Info(false, size, min, max);
        }

        if(left.isVal && right.isVal){
            maxBST=Math.max(maxBST,size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
    }

    public static void main(String arg[]){
        Node root=new Node(50);
        root.left=new Node(30);
        root.left.left=new Node(5);
        root.left.right=new Node(20);

        root.right=new Node(60);
        root.right.left=new Node(45);
        root.right.right=new Node(70);
        root.right.right.left=new Node(65);
        root.right.right.right=new Node(80);

        Info info =larBST(root);
        System.out.print("Largest BST : "+maxBST);
    }
    
}
