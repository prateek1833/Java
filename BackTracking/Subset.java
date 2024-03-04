public class Subset {
    public static void subset(String s,int i,String str){
        //Base case
        if(i==s.length()){
            System.out.print(str+"\n");
            return;
        }

        //Kaam
        subset(s, i+1,str+s.charAt(i));
        subset(s, i+1,str);
    }
    public static void main(String[] args){
        subset("Prateek", 0, "");
    }
    
}
