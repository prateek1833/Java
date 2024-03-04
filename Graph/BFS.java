import java.util.*;

public  class BFS {
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
    public static void bfs(ArrayList<edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                bfsutil(graph, vis);
            }
        }
    }
    public static void bfsutil(ArrayList<edge>[] graph,boolean[] vis){
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    edge e=graph[curr].get(i);
                    q.add(e.des);
                }
            }
        }
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


        bfs(graph);

    }

}
