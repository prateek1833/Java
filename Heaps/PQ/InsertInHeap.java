import java.util.*;

public class InsertInHeap {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data); // add at last index
            int x = arr.size() - 1; // x is last node
            int par = (x - 1) / 2; // par index
            while (arr.get(x) < arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x = par;
                par = (x - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        public int remove() {
            int data = arr.get(0);
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);
            arr.remove(arr.size() - 1);
            heapify(0);
            return data;
        }

        public void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(left) < arr.get(minIdx)) {
                minIdx = left;
            }
            if (right < arr.size() && arr.get(right) < arr.get(minIdx)) {
                minIdx = right;
            }
            if (minIdx != i) {
                int temp = arr.get(i);
                arr.set(0, arr.get(minIdx));
                arr.set(minIdx, temp);
                heapify(minIdx);
            }


        }
        public boolean isEmpty() {
            return arr.isEmpty();
        }
    }
    public static void main(String arg[]) {
        Heap h=new Heap();
        h.add(5);
        h.add(6);
        h.add(9);
        h.add(8);
        h.add(2);
        h.add(1);     
        
        while(!h.isEmpty()){
            System.out.println((h.peek()));
            h.remove();
        }

    }

}
