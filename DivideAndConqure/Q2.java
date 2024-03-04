public class Q2 {
    public static int count(int a[], int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (a[i] == num) {
                count++;
            }
        }
        return count;

    }

    public static int Majority(int a[], int lo, int hi) {
        if (lo == hi) {
            return a[lo]; // Base case: return the single element
        }
        int mid = lo + (hi - lo) / 2;
        int left = Majority(a, lo, mid);
        int right = Majority(a, mid + 1, hi);
        if(lo>hi) return -1;
        if (left == right) {
            return right;
        } 
            int leftCount = count(a, left, lo, hi);
            int rightCount = count(a, right, lo , hi);
        
        return leftCount>rightCount?left:right;
    }
    public static int Majority2(int a[]){
            return Majority(a, 0, a.length - 1);   //Doubt
    }

    public static void main(String[] args) {
        int a[] = { 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2 };
        System.out.print(Majority2(a));

    }
}
