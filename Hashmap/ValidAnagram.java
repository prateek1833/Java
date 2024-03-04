import java.util.HashMap;

public class ValidAnagram {
    public static void main(String arg[]){
        String s1="race";
        String s2="carl";
        HashMap <Character,Integer> map=new HashMap<>();
        char ch;
        for(int i=0;i<s1.length();i++){
            ch=s1.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }
        for(int i=0;i<s2.length();i++){
            ch=s2.charAt(i);
            if (map.containsKey(ch) && map.get(ch) == 1) {     // it is important to write map.containsKey(ch)
                map.remove(ch);
            }
            else if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
            }
        }
        Boolean T=map.isEmpty();
        System.out.print(T);
    }
}
