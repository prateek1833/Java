import java.util.*;

public class WeakSoldier {
    static class Row implements Comparable<Row> {
        int soldier;
        int idx;

        public Row(int soldier, int idx) {
            this.soldier = soldier;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row R2) {
            if (this.soldier == R2.soldier) {
                return this.idx - R2.idx;
            } else
                return this.soldier - R2.soldier;

        }
    }

    public static void main(String arg[]) {
        int a[][] = { { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 } };
        int k = 2;
        PriorityQueue<Row> p = new PriorityQueue<>();
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a[i].length; j++) {
                count += a[i][j] == 1 ? 1 : 0;
            }
            p.add(new Row(count, i));
        }
        for (int i = 0; i < k; i++) {
            System.out.print(p.remove().idx);
        }

    }
}
