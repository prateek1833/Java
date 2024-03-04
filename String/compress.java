public class compress { // O(n) time compexity
    public static String comp(String s){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            int count =1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(s.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();

    }
    public static void main(String arg[]){
        String s="aaaabbbccccdee";
        System.out.print(comp(s));
    }
}
