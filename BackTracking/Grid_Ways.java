public class Grid_Ways {
    static int count=0;
    public static void grid (int m,int n,int i,int j){
        if(i==m-1 && j==n-1){
            count++;
            return ;
        }
        else if(i==m || j==n){
            return ;
        }
        
        grid(m, n, i+1, j);
        grid(m, n, i, j+1);
    }
    public static void main(String arg[]){
        int m=17;
        int n=17;
        grid(m, n, 0, 0);
        System.out.print("No. of ways to reach destination = "+count);
    }
}
