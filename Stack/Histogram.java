import java.util.Stack;

public class Histogram {  //O(n)

    public static int maxArea(int a[]) {
        Stack<Integer> s = new Stack<>();
        int ng[] = new int[a.length];

        for (int i = 0; i <a.length  ; i++) {
            while (!s.isEmpty() && a[i] < a[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ng[i] = -1;
            } else {
                ng[i] = s.peek();
            }
            s.push(i);
        }
        System.out.print("NSL= ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(ng[i] + " ");
        }
        System.out.print("\n ");

        Stack<Integer> sr = new Stack<>();
        int ngr[] = new int[a.length];

        for (int i = a.length-1; i >= 0; i--) {
            while (!sr.isEmpty() && a[i] < a[sr.peek()]) {
                sr.pop();
            }
            if (sr.isEmpty()) {
                ngr[i] = a.length;
            } else {
                ngr[i] = sr.peek();
            }
            sr.push(i);
        }
        System.out.print("NSR= ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(ngr[i] + " ");
        }
        System.out.print("\n ");

        int max = 0, m;

        for (int i = 0; i < a.length; i++) {
            m = a[i] * (ngr[i] - ng[i] - 1);
            if (max < m) {
                max = m;
            }
        }
        return max;

    }

    public static void main(String arg[]) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        System.out.print(maxArea(arr));

    }

}
