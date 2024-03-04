public class RemoveDuplicates {   //this program remove the duplicate character from a string
    public static void RD(String str,int idx,StringBuilder sb,boolean map[]){
        if(idx==str.length()){
            System.out.print(sb);
            return;
        }
        char c=str.charAt(idx);
        if(map[c-'a']==true ){
        RD( str, idx+1,  sb,  map);
    }
    else{
        map[c-'a']=true; 
        RD( str, idx+1,  sb.append(c),  map);
    }
}

    public static void main(String arg[]) {
        String str="apppnafkddd";
        boolean m[] =new boolean[26];
    RD( str, 0, new StringBuilder(""),m);

    }
}
