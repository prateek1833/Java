public class Q3 {
    
    public static int StringLength(String str,int i){
        if( i==str.length()){
           return 0;
        }
        return StringLength(str, i+1)+1;
    }
    public static void main(String arg[]){
        String str="Prateek";
        System.out.print(StringLength(str, 0));
    }
    
    
}
