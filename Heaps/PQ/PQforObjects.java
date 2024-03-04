import java.util.Comparator;
import java.util.PriorityQueue;

public class PQforObjects {
    static class Student implements Comparable<Student> { // it gives power to student of comparision
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override   
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String arg[]) {
        // 1,2,3,4
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("a",15));
        pq.add(new Student("b",651));
        pq.add(new Student("c",789));
        pq.add(new Student("d",31));
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
    }
}
