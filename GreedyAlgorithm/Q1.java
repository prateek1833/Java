public class Q1 {
    public static int partition (String s){
        int balance=0,count=0;
        for(char c:s.toCharArray()){    //Remember this
            if(c=='L'){
                balance++;
            }
            else{
                balance--;
            }
            if(balance==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String arg[]){
        String s="LRRRRLLRLLRL";
        System.out.print("No.of partition = "+partition(s));
    }
    
}
