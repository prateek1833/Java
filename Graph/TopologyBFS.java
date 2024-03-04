import java.util.*;

public class TopologyBFS {
    public static class edge {
        int source;
        int des;

        public edge(int s, int d) {
            this.source = s;
            this.des = d;

        }
    }

    public static void createGraph(ArrayList<edge> graph[]) {
        int V = 6;
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new edge(2, 3));
        graph[3].add(new edge(3, 1));
        graph[5].add(new edge(5, 0));
        graph[5].add(new edge(5, 2));
        graph[4].add(new edge(4, 0));
        graph[4].add(new edge(4, 1));
    }

    public static void calIndegree(ArrayList<edge>[] graph, int Indegree[]) {
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                edge e = graph[i].get(j);
                Indegree[e.des]++;
            }
        }
    }

    public static void topoBFS(ArrayList<edge>[] graph) {
        int Indegree[] = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();
        calIndegree(graph, Indegree);
        for (int i = 0; i < Indegree.length; i++) {
            if (Indegree[i] == 0) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");
            for (int i = 0; i < graph[curr].size(); i++) {
                edge e = graph[curr].get(i);
                Indegree[e.des]--;
                if (Indegree[e.des] == 0) {
                    q.add(e.des);
                }
            }
        }

    }

    public static void main(String arg[]) {
        int V = 6;
        ArrayList<edge>[] graph = new ArrayList[V];
        createGraph(graph);
        topoBFS(graph);
    }
}
