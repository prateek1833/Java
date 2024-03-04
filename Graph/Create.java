import java.util.*;

public  class Create {
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

    public static void main(String arg[]) {
        int V = 5;
        ArrayList<edge>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // for 0 Node
        graph[0].add(new edge(0,1,5));

        //for 1 node
        graph[1].add(new edge(1,0,5));
        graph[1].add(new edge(1,0,1));
        graph[1].add(new edge(1,3,3));

        //for 2 node
        graph[2].add(new edge(2,1,1));
        graph[2].add(new edge(2,3,1));
        graph[2].add(new edge(2,4,2));

        //for 3 Node
        graph[3].add(new edge(3,1,3));
        graph[3].add(new edge(3,2,1));

        //for 4 Node
        graph[4].add(new edge(4,2,2));

        //Neighbours of 2
        for(int i=0;i<graph[2].size();i++){
            edge e=graph[2].get(i);
            System.out.println(e.des+"->"+e.weight);
        }

    }

}
