public class QuickSorting {
    public static void QuickSort(int a[], int s, int e) {
        if (s >= e) {
            return;
        }
        int pidx = partition(a, s, e);
        QuickSort(a, s, pidx - 1);
        QuickSort(a, pidx + 1, e);
    }
    public static int partition(int a[], int s, int e) {
        int pivot=a[e];
        int i=s-1;   //to make place for smaller elements than pivot
        
        for(int j=s;j<e;j++){
            if(a[j]<=pivot){
                i++;
                int temp=a[i];    //Swap
                a[i]=a[j];
                a[j]=temp;
            }
        }
        i++;
        int temp=pivot;
        a[e]=a[i];
        a[i]=temp;
        return i;

    }
    public static void Print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
    public static void main(String arg[]){
        int a[]={5,-6,24,9,2,4,1};
        QuickSort(a, 0, a.length-1);
        Print(a);
    }

}
