public class TilingProblem {
    public static int Tile(int n){
        if(n==0 || n==1) return 1;
        return Tile(n-1)+Tile(n-2);
    }
    public static void main(String arg[]){
        System.out.print(Tile(4));
    }
    
}
