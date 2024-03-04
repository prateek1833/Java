public class InvNumPyr {
        public static void inverted_pyramid(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if((i+j)<=n+1){
                        System.out.print(j);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        public static void main(String arg[]){
            inverted_pyramid(5);
        }
    
    }
    
    

