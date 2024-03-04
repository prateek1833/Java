import java.util.Stack;

public class NextGreaterEle {

    public static void NG(int a[]) {
        Stack <Integer> s=new Stack<>();
        int ng[]=new int[a.length];

        for(int i=a.length-1;i>=0;i--){
            while(!s.isEmpty() && a[i]>a[s.peek()]){
            s.pop();
            }
            if(s.isEmpty()){
                ng[i]=-1;
            } 
            else{
                ng[i]=a[s.peek()];
            }      
            s.push(i);
        }
        for(int i=0;i<a.length;i++){
            System.out.print(ng[i]+" ");
        }
    }

    public static void main(String arg[]) {
        int arr[] = { 6, 8, 0, 1, 3 };
        NG(arr);

    }

}
