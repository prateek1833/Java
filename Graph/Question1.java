import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Question1 {
    public static class edge {
        int src;
        int des;

        public edge(int src, int des) {
            this.src = src;
            this.des = des;
        }
    }

    public static void CreateGraph(ArrayList<edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(0, 1));
        graph[1].add(new edge(1, 2));
        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 3));
        
    }

    public static boolean detectcycle(ArrayList<edge>[] graph){
        boolean vis[] = new boolean[5];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (!detectcycleutil(graph, vis)) {
                    return false;
                }
            }
        }
        return true;
    }
    

    public static boolean detectcycleutil(ArrayList<edge>[] graph, boolean vis[]) {
        Queue<Integer> q = new LinkedList<>();
        int par=-1;
        q.add(0);
        vis[0]=true;
        while (!q.isEmpty()) {
            int curr = q.poll();
            for (int i = 0; i < graph[curr].size(); i++) {
                edge e = graph[curr].get(i);
                if (vis[e.des] && par != e.des) {
                    return true;
                } else {
                    vis[e.des]=true;
                    q.add(e.des);
                    par = curr;
                }
            }

        }
        return false;

    }

    public static void main(String arg[]) {
        int V = 5;
        ArrayList<edge>[] graph = new ArrayList[V];
        CreateGraph(graph);
        System.out.print(detectcycle(graph));
    }

}
