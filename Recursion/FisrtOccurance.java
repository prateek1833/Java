public class FisrtOccurance {
    public static int FO(int a[],int n,int i){ //To check the first occurance of any number in array
        if(i==a.length-1){
            return -1;
        }
        if(a[i]==n){
            return i;
        }
        return FO(a,n,i+1);

    }
    public static void main(String[] args){
        int b[]={1,6,2,5,6};
        System.out.println(FO(b,5,0));
    }
    
} //Time complexity  O(n)
