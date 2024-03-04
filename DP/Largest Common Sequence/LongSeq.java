public class LongSeq {

    public static int LongestSequence(String str1,String str2,int m,int n){
        if(m==0 || n==0){
            return 0;
        }
        if(str1.charAt(m-1)!=str2.charAt(n-1)){
            int s1=LongestSequence(str1, str2, m-1, n);
            int s2=LongestSequence(str1, str2, m, n-1);
            return Math.max(s1, s2);
        }
        else{
            return LongestSequence(str1, str2, m-1, n-1)+1;
        }
    }
    public static void main(String args[]){
        String str1="abcdge";
        String str2="abedg";
        System.out.println(LongestSequence(str1, str2,str1.length(),str2.length()));
    }
    
}
