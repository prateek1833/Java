import java.util.*;

public class cheapestflight {
    public static class edge {
        int src;
        int des;
        int wt;

        public edge(int src, int des, int wt) {
            this.src = src;
            this.des = des;
            this.wt = wt;
        }
    }

    public static class info {
        int v;
        int c;
        int k;

        public info(int v, int c, int k) {
            this.v = v;
            this.c = c;
            this.k = k;
        }
    }

    public static void createGraph(ArrayList<edge>[] graph, int flight[][]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < flight.length; i++) {
            int src = flight[i][0];
            int des = flight[i][1];
            int wt = flight[i][2];

            graph[src].add(new edge(src, des, wt));
        }
    }

    public static int cheapest(ArrayList<edge>[] graph, int src, int des, int K) {
        int dist[] = new int[graph.length];
        Queue<info> q = new LinkedList<>();
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        q.add(new info(src, 0, 0));
        while (!q.isEmpty()) {
            info curr = q.remove();
            if (curr.k > K) {
                break;
            }
            for (int i = 0; i < graph[curr.v].size(); i++) {
                edge e = graph[curr.v].get(i);
                int u = e.src;
                int v = e.des;
                int wt = e.wt;
                if (dist[v] > curr.c + wt && curr.k <= K) {
                    dist[v] = curr.c + wt;
                }
                q.add(new info(v, dist[v], curr.k + 1));
            }
        }
        if (dist[des] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return dist[des];
        }

    }

    public static void main(String arg[]) {
        int flight[][] = { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 } };
        ArrayList<edge>[] graph = new ArrayList[flight.length];
        int src = 0;
        int des = 3;
        int k=1;
        createGraph(graph, flight);
        System.out.print(cheapest(graph, src, des, k));
    }
}
