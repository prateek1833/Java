import java.util.*;      

public class Topology {
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
        graph[3].add(new edge(5, 0));
        graph[3].add(new edge(5, 2));
        graph[3].add(new edge(4, 0));
        graph[3].add(new edge(4, 1));
    }
    public static void topo(ArrayList<edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topoutil(graph,vis,i,s);
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    public static void topoutil(ArrayList <edge> graph[],boolean vis[],int curr,Stack<Integer> s){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            edge e = graph[curr].get(i);
            if(!vis[e.des]){
                topoutil(graph, vis, e.des, s);
            }
        }
        s.push(curr);
    }

    
    

    public static void main(String arg[]) {
        int V = 6;
        ArrayList<edge>[] graph = new ArrayList[V];
        createGraph(graph);
       topo(graph);

    }
}
   /* 
   
    5         4
    | \      /|
    |  \   /  |
    *   * *   *
    2    0    1
     \      *
      \    /
       *  /
        3
        

        */