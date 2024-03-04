public class Q2 {
    
    public static void One(String a[],int b[],int i){
        if(i==b.length){
            return;
        }
        System.out.print(a[b[i]]+" ");
        One(a, b, i+1);
    }
    public static void printdigit(String a[],int p){
        if(p==0){
            return;
        }
        int n=p%10;
        printdigit(a, p/10);
        System.out.print(a[n]+" ");
    }


    public static void main(String arg[]){
        String a[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int b[]={5,3,7,6};
        int p=5376;
        printdigit(a, p);
        // One(a, b, 0);
    }
}
