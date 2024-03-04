import java.util.ArrayList;

public class IndianCoin {
    public static void main(String arg[]){
        int coin[] ={1,2,5,10,20,50,100,500,2000};
        ArrayList <Integer> a=new ArrayList<>();
        int V=590;
        int remain=V;
        for(int i=coin.length-1;i>=0;i--){
            if(remain>=coin[i] && remain<coin[i+1]){
                remain-=coin[i];
                a.add(coin[i]);  
                i++;
            }
        
        }
        for (int i = a.size() - 1; i >= 0; i--) {
        System.out.println(a.get(i));
        }
    }
    
}
