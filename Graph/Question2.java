import java.util.ArrayList;
//wrong

public class Question2 {
    public static class edge {
        int src;
        int des;

        public edge(int src, int des) {
            this.src = src;
            this.des = des;
        }
    }

    public static void CreateGraph(ArrayList<edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));
        graph[1].add(new edge(1, 4));
        graph[4].add(new edge(4, 6));
        graph[2].add(new edge(2, 3));
        graph[3].add(new edge(3, 7));
        graph[5].add(new edge(5, 8));

    }

    public static int minHeight(ArrayList<edge>[] graph, int height, int min, int curr) {
        if(graph[curr].size()==2){
            edge e1=graph[curr].get(0);
            int newheight=height+1;
            int left=minHeight(graph, newheight, min, e1.des);
            edge e2=graph[curr].get(1);
            int right=minHeight(graph, newheight, min, e2.des);
            min = Math.min(min, Math.min(left, right));
        }
        else {
            return Math.min(min, height);
        }
        return min;
    }

    public static void main(String arg[]) {
        int V = 9;
        ArrayList<edge>[] graph = new ArrayList[V];
        CreateGraph(graph);
        System.out.print(minHeight(graph, 0, Integer.MAX_VALUE,  0));
    }

}
