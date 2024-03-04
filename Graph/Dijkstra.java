import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {
    public static class edge{
        int src;
        int des;
        int wt;
        public edge(int src,int des,int wt){
            this.src=src;
            this.des=des;
            this.wt=wt;
        }
    }
    public static void createGraph(ArrayList<edge>[]graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new edge(0,1,2));
        graph[0].add(new edge(0,2,4));        
        graph[1].add(new edge(1,2,1));
        graph[1].add(new edge(1,3,7));
        graph[2].add(new edge(2,4,3));
        graph[3].add(new edge(3,5,1));
        graph[4].add(new edge(4,3,2));
        graph[4].add(new edge(4,5,5));

    }
    public static class pair implements Comparable<pair>{
        int node;
        int path;
        public pair(int node,int path){
            this.node=node;
            this.path=path;
        }
        @Override
        public int compareTo (pair p2){
            return this.path-p2.path;
        }
    }
    public static void maxpath(int path[]){
        path[0]=0;
        for(int i=0;i<path.length;i++){
            if(i!=0){
                path[i]=Integer.MAX_VALUE;
            }
        }
    }
    public static void dijkstra(ArrayList<edge>[]graph,int src){
        int path[]=new int[graph.length];
        boolean vis[]=new boolean[graph.length];
        maxpath(path);
        PriorityQueue<pair> pq=new PriorityQueue<>();
        pq.add(new pair(src, 0));
        while(!pq.isEmpty()){
            pair curr=pq.remove();
            if(!vis[curr.node]){
                vis[curr.node]=true;
                for(int i=0;i<graph[curr.node].size();i++){
                    edge e=graph[curr.node].get(i);
                    int u=e.src;
                    int v=e.des;
                    int weight=e.wt;
                    if(path[u]+weight<path[v]){
                        path[v]=path[u]+weight;
                        pq.add(new pair(v, path[v]));
                    }
                }
            }
        }
        for(int i=0;i<path.length;i++){
            System.out.print(path[i]+" ");
        }

    }
    
    public static void main(String arg[]){
        int V=6;
        ArrayList<edge>[] graph=new ArrayList[V];
        createGraph(graph);
        dijkstra(graph, 0);
    }
}
