import java.util.PriorityQueue;

public class ConnectingCities {
    public static class edge implements Comparable<edge> {
        int vertex;
        int cost;

        public edge(int v, int c) {
            this.vertex = v;
            this.cost = c;
        }

        @Override
        public int compareTo(edge e2) {
            return this.cost - e2.cost;
        }
    }

    public static int FinalCost(int cities[][]) {
        PriorityQueue<edge> pq = new PriorityQueue<>();
        int FinalCost = 0;
        boolean vis[] = new boolean[cities[0].length];
        pq.add(new edge(0, 0));
        while (!pq.isEmpty()) {
            edge e = pq.remove();
            if (!vis[e.vertex]) {
                vis[e.vertex] = true;
                FinalCost += e.cost;
                for (int i = 0; i < cities[e.vertex].length; i++) {
                    if (cities[e.vertex][i] != 0) {
                        pq.add(new edge(i, cities[e.vertex][i]));
                    }

                }
            }
        }
        return FinalCost;
    }

    public static void main(String arg[]) {
        int cities[][] = { { 0, 1, 2, 3, 4 }, { 1, 0, 5, 0, 7 }, { 2, 5, 0, 6, 0 }, { 3, 0, 6, 0, 0 },
                { 4, 7, 0, 0, 0 } };
        System.out.print(FinalCost(cities));

    }

}
