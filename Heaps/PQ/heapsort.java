public class heapsort {

    public static void heapify(int a[],int i,int size){
        int left=2*i+1;
        int right=2*i+2;
        int minIdx=i;
        if(left<size && a[minIdx]>a[left] ){
            minIdx=left;
        }
        if(right<size && a[minIdx]>a[right] ){
            minIdx=right;
        }
        if(minIdx!=i){
            int temp=a[minIdx];
            a[minIdx]=a[i];
            a[i]=temp;
            heapify(a, minIdx, size);
        }

    }
    public static void Heapsort(int a[]){
        int i;
        //step1=build maxheap
        int n=a.length;
        for(i=n/2;i>=0;i--){
            heapify(a,i,n);
        }
        //step2-> push largest at end
        for(i=n-1;i>0;i--){
            int temp=a[i];
            a[i]=a[0];
            a[0]=temp;
            heapify(a,0,i);
        }
    }

    public static void main(String arg[]){
        int a[]={3,5,2,1,9,7};
        Heapsort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
    
}
