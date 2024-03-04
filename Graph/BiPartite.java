import java.util.*;

public class BiPartite {
    public static class edge {
        int source;
        int des;

        public edge(int s, int d) {
            this.source = s;
            this.des = d;

        }
    }

    public static boolean bipartite(ArrayList<edge>[] graph) {
        int vis[] = new int[graph.length];
        for (int i = 0; i < vis.length; i++) {
            vis[i] = -1;
        } 
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (vis[i] == -1) {
                q.add(i);
                vis[i] = 0; // Yellow
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        edge e = graph[curr].get(j);
                        if (vis[e.des] == -1) {
                            int nextcol = (vis[curr] == 0 ? 1 : 0);
                            vis[e.des]=nextcol;
                            q.add(e.des);
                        } else if (vis[e.des] == vis[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String arg[]) {
        int V = 5;
        ArrayList<edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<edge>();
        }

        // for 0 Node
        graph[0].add(new edge(0, 1));
        // graph[0].add(new edge(0, 4));

        // for 1 node
        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 2));

        // for 2 node
        graph[2].add(new edge(2, 3));
        graph[2].add(new edge(2, 1));
        // for 3 Node
        graph[3].add(new edge(3, 2));
        graph[3].add(new edge(3, 4));

        // for 4 Node
        graph[4].add(new edge(4, 3));
        // graph[4].add(new edge(4, 0));

        System.out.print(bipartite(graph));

    }
}
