public class SearchinSortedRotatedArray {
    public static int SR(int a[], int s, int e, int tar) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (a[mid] == tar) { // found index
            return mid;
        } else if (a[s] <= a[mid]) {
            if (a[s] <= tar && tar < a[mid]) { // mid lies onL1
                return SR(a, s, mid - 1, tar);
            } else {
                return SR(a, mid + 1, e, tar);
            }
        } else {
            if (a[mid] < tar && tar <= a[e]) { // mid lies on L2
                return SR(a, mid + 1, e, tar);
            } else {
                return SR(a, s, mid - 1, tar);
            }
        }

    }

    public static void main(String[] args) {
        int b[] = { 4, 5, 8, 9, 0, 2, 3, 4 };
        System.out.print(SR(b, 0, b.length - 1, 0));
    }
}
