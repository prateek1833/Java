import java.util.ArrayList;
import java.util.PriorityQueue;


public class PrimsAlgo {
    public static class Edge{
        int src;
        int des;
        int wt;
        public Edge(int src,int des, int wt){
            this.src=src;
            this.des=des;
            this.wt=wt;
        }
    }
     static class Pair implements Comparable <Pair>{
        int v;
        int cost;
        public Pair(int v,int cost){
            this.v=v;
            this.cost=cost;
        }
        @Override
        public int compareTo(Pair P2){
            return this.cost-P2.cost;
        }
    }
    public static void CreateGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));
        graph[1].add(new Edge(1, 3,40));
        graph[2].add(new Edge(2, 3, 50));
    }
    public static int prims(ArrayList<Edge> graph[],int V){
        boolean vis[]=new boolean[V];
        int finalcost=0;
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!vis[curr.v]){
                vis[curr.v]=true;
                finalcost+=curr.cost;
                for(int i=0;i<graph[curr.v].size();i++){
                    Edge e=graph[curr.v].get(i);
                    pq.add(new Pair(e.des, e.wt));
                }
            }
        }
        return finalcost;
    }

    public static void main(String args[]) {
        int V=5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        CreateGraph(graph);
        System.out.println("Final Cost = "+prims(graph, V));
    }
    
}
