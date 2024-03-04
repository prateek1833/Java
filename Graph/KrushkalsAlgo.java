import java.util.ArrayList;
import java.util.Collections;

public class KrushkalsAlgo {
    static int n = 5;
    static int rank[] = new int[n];
    static int par[] = new int[n];

    public static class edge implements Comparable<edge> {
        int src;
        int des;
        int wt;

        public edge(int src, int des, int wt) {
            this.src = src;
            this.des = des;
            this.wt = wt;
        }

        @Override
        public int compareTo(edge e2) {
            return this.wt - e2.wt;
        }
    }

    public static void init() {
        for (int i = 0; i < n; i++) {
            // rank[i] = 0;
            par[i] = i;
        }
    }

    public static int find(int a) {
        if (a == par[a]) {
            return a;
        }
        return par[a] = find(par[a]);
    }

    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);
        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }

    public static int Krushkals(ArrayList<edge> graph) {
        Collections.sort(graph);
        int minCost = 0;
        for (int i = 0; i < graph.size(); i++) {
            edge e = graph.get(i);
            int parA = find(e.src);
            int parB = find(e.des);
            if(parA!=parB){
                union(e.src, e.des);
                minCost+=e.wt;
            }
        }
        return minCost;
    }
    
    public static void main(String arg[]) {
        init();
        ArrayList<edge> graph = new ArrayList<>();
        graph.add(new edge(0, 1, 10));
        graph.add(new edge(0, 2, 15));
        graph.add(new edge(0, 3, 20));
        graph.add(new edge(1, 3, 40));
        graph.add(new edge(2, 3, 50));
        
        System.out.println(Krushkals(graph));
    }
}
