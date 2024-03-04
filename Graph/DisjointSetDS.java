public class DisjointSetDS {
    static int n = 7;
    static int rank[] = new int[n];
    static int par[] = new int[n];

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
        return par[a]=find(par[a]);
    }

    public static void union(int a, int b) {
        int parA=find(a);
        int parB=find(b);
        if (parA == parB) {
            return; // They are already in the same set
        }
        else if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        }
        else{
            par[parB] = parA;
        }
    }
    public static void main(String arg[]){
        init();
        System.out.println(find(3));
        union(1, 3);
        union(2, 4);
        union(3, 6);
        System.out.println(find(3));
        union(1, 4);
        union(1, 5);
        System.out.println(find(4));

    }
}
