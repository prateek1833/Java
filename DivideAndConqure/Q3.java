// package DivideAndConqure;

// import OOPs.statickey;

public class Q3 { // time=O(nlogn) Space=(n)
    public static int MergeSort(int a[], int s, int e) {
        int InvCount=0;
        if (s >= e)
            return InvCount;
        int mid = s  + (e - s) / 2;
        InvCount=MergeSort(a, s, mid);
        InvCount=+MergeSort(a, mid + 1, e);
        InvCount=+Merge(a, s,mid, e);
        return InvCount;
    }

    public static int Merge(int a[], int s,int mid ,int e) {
        int temp[] = new int[e - s + 1]; // temporary array
        int i = s; // initial index for left array
        int j = mid + 1; // initial index for right array
        int k = 0; // initial index for temporary array
        int InvCount=0;

        while (i <= mid && j <= e) { // merging with sorting
            if (a[i] < a[j]) {
                temp[k] = a[i];
                i++;
                k++;
            } else {
                temp[k] = a[j];
                j++;
                k++;
                InvCount+=mid-i+1;
            }
        }

        while (i <= mid) { // for remaining element in left array
            temp[k++] = a[i++];
        }
        while (j <= e) { // for remaining element in right array
            temp[k++] = a[j++];
        }
        for (k = 0, i = s; k < temp.length; k++, i++) { // copying temporary array elements in original array
            a[i] = temp[k];
        }
        return InvCount;
        
    }
    

    public static void main(String[] arg) {
        int a[] = { 3, 6, 8, 4, 7 };
        int IC=MergeSort(a, 0, a.length - 1);
        System.out.print(IC);
    }
}
