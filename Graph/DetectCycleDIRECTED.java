import java.util.*;      

public class DetectCycleDIRECTED {
    public static class edge {
        int source;
        int des;

        public edge(int s, int d) {
            this.source = s;
            this.des = d;

        }
    }

    public static void createGraph(ArrayList<edge> graph[]) {
        int V = 4;
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(0, 2));
        graph[1].add(new edge(1, 0));
        graph[2].add(new edge(2, 3));
        graph[3].add(new edge(3, 0));
    }

    public static boolean isCycle(ArrayList<edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (iscycleutil(graph, vis, stack, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean iscycleutil(ArrayList<edge>[] graph, boolean vis[], boolean stack[], int curr) {
        if (!vis[curr]) {
            vis[curr] = true;
            stack[curr] = true;
    
            for (int j = 0; j < graph[curr].size(); j++) {
                edge e = graph[curr].get(j);
    
                if (stack[e.des]) {
                    return true;
                }
                if (!vis[e.des] && iscycleutil(graph, vis, stack, e.des)) {
                    return true;
                } 
            }
        }
        stack[curr] = false;
        return false;
    }
    

    public static void main(String arg[]) {
        int V = 4;
        ArrayList<edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.print(isCycle(graph));

    }
}
