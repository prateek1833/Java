public class Q1 {
    public static void key(int i,int key,int a[]){
        if(i==a.length){
            return;
        }
        if(a[i]==key){
            System.out.print(i+" ");
        }
        key(i+1, key, a);
    }
    public static void main(String arg[]){
        int a[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
        key(0, 2,a );
    }
    
}
