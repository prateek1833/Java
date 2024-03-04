import java.util.ArrayList;
import java.util.Stack;
import java.util.*;

public class KosaRajusAlgo {
    public static class edge {
        int src;
        int des;

        public edge(int src, int des) {
            this.src = src;
            this.des = des;
        }
    }

    public static void createGraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<edge>();
        }
        graph[0].add(new edge(0, 2));
        graph[2].add(new edge(2, 1));
        graph[1].add(new edge(1, 0));
        graph[0].add(new edge(0, 3));
        graph[3].add(new edge(3, 4));
    }

    public static ArrayList[] RevGraph(ArrayList<edge> graph[],boolean vis[]) {
        ArrayList<edge> Rev[] = new ArrayList[graph.length];
        for (int i = 0; i < graph.length; i++) {
            Rev[i] = new ArrayList<>();
            vis[i]=false;
        }
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                edge e = graph[i].get(j);
                Rev[e.des].add(new edge(e.des, e.src));
            }
        }
        return Rev;
    }

    public static void topology(ArrayList<edge> graph[], boolean vis[], int curr, Stack<Integer> s) {
        if (!vis[curr]) {
            vis[curr] = true;
            for (int i = 0; i < graph[curr].size(); i++) {
                edge e = graph[curr].get(i);
                topology(graph, vis, e.des, s);
            }
            s.push(curr);
        }
    }

    public static void DFS(ArrayList<edge> graph[], boolean vis[], int curr) {

        if (!vis[curr]) {
            vis[curr] = true;
            System.out.print(curr+" ");
            for (int i = 0; i < graph[curr].size(); i++) {
                edge e = graph[curr].get(i);
                DFS(graph, vis, e.des);

            }
        }
    }

    public static void KosaRajusAlgo(ArrayList<edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < graph.length; i++) {
            vis[i] = false;
        }
        for (int i = 0; i < graph.length; i++) {
            topology(graph, vis, i, s);
        }
        ArrayList<edge> Rev[] = RevGraph(graph,vis);

        while(!s.empty()){
            int curr=s.pop();
            // System.out.print("SCC--> ");
            DFS(Rev, vis, curr);
            System.out.println(" ");
        }

    }

    public static void main(String arg[]) {
        ArrayList<edge> graph[] = new ArrayList[5];
        createGraph(graph);
        KosaRajusAlgo(graph);
    }
}