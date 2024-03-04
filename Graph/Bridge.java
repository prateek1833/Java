import java.util.*;

public class Bridge {

    public static class edge {
        int source;
        int des;

        public edge(int s, int d) {
            this.source = s;
            this.des = d;

        }
    }

    public static void dfs(ArrayList<edge>[] graph, boolean vis[], int curr, int par, int dt[], int low[], int time) {
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (e.des == par) {
                continue;
            } 
            else if (!vis[e.des]) {
                dfs(graph, vis, e.des, curr, dt, low, time);
                low[curr] = Math.min(low[curr], low[e.des]);
                if (dt[curr] < low[e.des]) {
                    System.out.println("bridge from " + e.source + "--->" + e.des);
                }

            } else if (vis[e.des]) {
                low[curr] = Math.min(low[curr], dt[e.des]);
            }
        }
    }

    public static void bridge(ArrayList<edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        int dt[] = new int[graph.length];
        int low[] = new int[graph.length];
        int par = -1, time = 0;
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                dfs(graph, vis, i, par, dt, low, time);
            }
        }
    }

    public static void main(String arg[]) {
        int V = 6;
        ArrayList<edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<edge>();
        }

        // for 0 Node
        graph[0].add(new edge(0, 1));
        graph[1].add(new edge(1, 0));

        graph[1].add(new edge(1, 2));
        graph[2].add(new edge(2, 1));

        graph[2].add(new edge(2, 0));
        graph[0].add(new edge(0, 2));

        graph[0].add(new edge(0, 3));
        graph[3].add(new edge(3, 0));

        graph[3].add(new edge(3, 5));
        graph[5].add(new edge(5, 3));

        graph[4].add(new edge(4, 5));
        graph[5].add(new edge(5, 4));

        graph[3].add(new edge(3, 4));
        graph[4].add(new edge(4, 3));

        bridge(graph);
    }
}
