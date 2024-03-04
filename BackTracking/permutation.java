public class permutation {
    public static void perm(String s,String str){
        //Base case
        if(s.length()==0){
            System.out.print(str+"\n");
            return;
        }

        //Recursion
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            String newstr=s.substring(0, i)+s.substring(i+1, s.length());
            perm(newstr, str+curr);
        }
    }
    public static void main(String arg[]){
        String s="abcdef";
        String str="";
        
        perm(s, str);
    }
}
