import java.util.*;

public class BellmanFord {
    public static class Edge {
        int src;
        int des;
        int wt;

        public Edge(int src, int des, int wt) {
            this.des = des;
            this.src = src;
            this.wt = wt;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph) {
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));
        graph.add(new Edge(1, 2, -4));
        graph.add(new Edge(2, 3, 2));
        graph.add(new Edge(3, 4, 4));
        graph.add(new Edge(4, 1, -1));
    }
    public static void Bellman(ArrayList<Edge> graph,int V){
        int dis[]=new int[V];
        for(int i=0;i<dis.length;i++){
            if(i!=0){
                dis[i]=Integer.MAX_VALUE;
            }
        }
        for(int i=0;i<V-1;i++){
            for(int j=0;j<graph.size();j++){
                Edge e=graph.get(j);
                int u=e.src;
                int v=e.des;
                int w=e.wt;
                if(dis[u]!=Integer.MAX_VALUE && dis[v]>dis[u]+w){
                    dis[v]=dis[u]+w;
                }
            }
        }
        for(int i=0;i<dis.length;i++){
            System.out.print(dis[i]+" ");
        }
    }

    public static void main(String args[]) {
        ArrayList<Edge> graph = new ArrayList<>();
        CreateGraph(graph);
        int V=5;
        Bellman(graph, V);
    }

}
