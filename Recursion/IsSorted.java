public class IsSorted {
    public static boolean IsSort(int a[],int i){ //program to check a array is sorted or not
        if(i==a.length-1){
            return true;
        }
        if(a[i]>a[i+1]){
            return false;
        }
        return IsSort(a,i+1);
    }
    public static void main(String arg[]){
        int b[]={1,3,9,5,7};
        System.out.print(IsSort(b, 0));
    }
} //    time complexity = O(n)
