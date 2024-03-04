import java.util.*;      //Not understand well

public class DetectcycleUNDIR {
    public static class edge {
        int source;
        int des;

        public edge(int s, int d) {
            this.source = s;
            this.des = d;

        }
    }

    

    public static boolean isCycle(ArrayList<edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (iscycleutil(graph, vis, -1, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean iscycleutil(ArrayList<edge>[] graph, boolean vis[], int par, int curr) {
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            edge e=graph[curr].get(i);
            if(!vis[e.des] && iscycleutil(graph, vis, curr, e.des)){
                return true;
            }
            else if(vis[e.des] && e.des!=par){
                return true;
            }
        }
        return false;
    }
    

    public static void main(String arg[]) {
        int V = 5;
        ArrayList<edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        
        graph[0].add(new edge(0, 2));
        graph[0].add(new edge(0, 3));
        graph[1].add(new edge(1, 2));
        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 1));
        graph[3].add(new edge(3, 0));
        graph[3].add(new edge(3, 4));
        graph[4].add(new edge(4, 3));
        
        if (isCycle(graph)) {
            System.out.println("Graph contains cycle");
        } else {
            System.out.println("Graph does not contain cycle");
        }
    }
}
