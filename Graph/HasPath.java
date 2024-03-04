import java.util.*;

public  class HasPath {
    public static class edge {
        int source;
        int des;
        int weight;

        public  edge(int s, int d, int w) {
            this.source = s;
            this.des = d;
            this.weight = w;
        }
    }
    public static boolean haspath(ArrayList<edge>[] graph,int source,int des,boolean vis[]){
        if(source==des){
            return true;
        }
        vis[source]=true;
        for(int i=0;i<graph[source].size();i++){
            edge e=graph[source].get(i);
            if(!vis[e.des] && haspath(graph, e.des, des, vis)){
                return true;
            }
        }
        return false;
    }

    public static void main(String arg[]) {
        int V = 7;
        ArrayList<edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<edge>();
        }

        // for 0 Node
        graph[0].add(new edge(0,1,1));
        graph[0].add(new edge(0,2,1));

        //for 1 node
        graph[1].add(new edge(1,3,1));
        graph[1].add(new edge(1,2,1));
  
        //for 2 node
        graph[2].add(new edge(2,0,1));
        graph[2].add(new edge(2,4,1));

        //for 3 Node
        graph[3].add(new edge(3,1,1));
        graph[3].add(new edge(3,4,1));
        graph[3].add(new edge(3,5,1));

        //for 4 Node
        graph[4].add(new edge(4,2,1));
        graph[4].add(new edge(4,3,1));
        graph[4].add(new edge(4,5,1));

        //for 5 Node
        graph[5].add(new edge(5,6,1));
        graph[5].add(new edge(5,3,1));
        graph[5].add(new edge(5,4,1));

        //for 6 Node
        graph[6].add(new edge(6,5,1));

        boolean vis[]=new boolean[graph.length];

        System.out.print(haspath(graph, 0, 5, vis));

    }

}
