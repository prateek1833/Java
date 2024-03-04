public class invertedPyramid {
    public static void inverted_pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i+j)>4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        inverted_pyramid(4);
    }

}
