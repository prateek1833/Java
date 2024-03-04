import java.util.*;

public class AllPath {
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
        graph[0].add(new edge(0, 3));
    }

    public static void path(ArrayList<edge>[] graph,int src,int des,String path){
        if(src==des){
            System.out.println(path+des);
        }
        else{
            for(int i=0;i<graph[src].size();i++){
                edge e=graph[src].get(i);
                path(graph, e.des, des, path+src);
            }
        }
    }
    public static void main(String arg[]) {
        int V = 6;
        ArrayList<edge>[] graph = new ArrayList[V];
        createGraph(graph);
        int src=5,des=1;
        path(graph, src, des, "");
    }
}
