import java.util.*;
public class Q3 {
    public static void reversek(Queue <Integer> q,int k){
        Stack <Integer> s=new Stack<>();
        while(k-->0){
            s.push(q.remove());
        }
        Queue <Integer> q2=new LinkedList<>();
        while(!s.isEmpty()){
            q2.add(s.pop());
        }
        while(!q.isEmpty()){
            q2.add(q.remove());
        }
        while(!q2.isEmpty()){
            System.out.println(q2.remove());
        }
    }
    public static void main(String arg[]){
        Queue <Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        int k=5;
        reversek(q, k);
    }
}
