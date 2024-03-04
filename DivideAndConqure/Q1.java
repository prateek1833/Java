// package DivideAndConqure;

// import OOPs.statickey;

public class Q1 { // Sort "sun", "earth", "mars", "mercury" using merge sort
    public static void MergeSort(String a[], int s, int e) {
        if (s >= e)
            return;
        int mid = s  + (e - s) / 2;
        MergeSort(a, s, mid);
        MergeSort(a, mid + 1, e);
        Merge(a, s,mid, e);
    }

    public static void Merge(String a[], int s,int mid ,int e) {
        String temp[] = new String[e - s + 1]; // temporary array
        int i = s; // initial index for left array
        int j = mid + 1; // initial index for right array
        int k = 0; // initial index for temporary array

        while (i <= mid && j <= e) { // merging with sorting
            if (a[i].compareTo(a[j])<0) {
                temp[k] = a[i];
                i++;
                k++;
            } else {
                temp[k] = a[j];
                j++;
                k++;
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
        
    }
    public static void Print(String a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }

    public static void main(String[] arg) {
        String a[] = { "sun", "earth", "mars", "mercury"};
        MergeSort(a, 0, a.length - 1);
        Print(a);

    }
}
