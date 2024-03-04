public class StringBuild {
    public static void main(String arg[]){
        StringBuilder sb=new StringBuilder("HW");
        for(char ch='a';ch<'z';ch++){
            sb.append(ch);
        }
        System.out.print(sb);
    }
    
}
