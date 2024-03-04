import java.rmi.ConnectIOException;
import java.util.*;

public class TopView {
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

        static class Info{
            int hd;
            Node node;
            public Info(int hd,Node node){
                this.hd=hd;
                this.node=node;
            }
        }
        public static void topview(Node root){
            Queue<Info> q=new LinkedList<>();
            HashMap<Integer,Node>map=new HashMap<>();
            int min=0,max=0;
            q.add(new Info(0, root));
            q.add(null);
            while(!q.isEmpty()){
                Info curr=q.remove();
                if(curr==null){
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    if(!map.containsKey(curr.hd)){
                        map.put(curr.hd, curr.node);
                    }
                    if(curr.node.left!=null){
                        q.add(new Info(curr.hd-1, curr.node.left));
                        min=Math.min(min,curr.hd-1);
                    }
                    if(curr.node.right!=null){
                        q.add(new Info(curr.hd+1, curr.node.right));
                        max=Math.max(max,curr.hd+1);
                    }
                }
            }
            for(int i=min;i<=max;i++){
               System.out.print(map.get(i).data+" ");
            }
        }
        


    }

    public static void main(String arg[]) {
        int a[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(a);
        BinaryTree.topview(root);
        
    }

}

