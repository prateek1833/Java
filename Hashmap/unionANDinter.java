import java.util.HashSet;

public class unionANDinter {
    public static void main(String arg[]){
        int a[]={7,3,9};
        int b[]={8,2,5,4,3,2,4,2,8,9,9,2,9};
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<a.length;i++){    //UNION
            hs.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            hs.add(b[i]);
        }
        System.out.println("Union->."+hs);


        hs.clear();
        int count=0;
        for(int i=0;i<a.length;i++){    //INTERSECTION
            hs.add(a[i]);
        }
        System.out.print("Intersection->");
        for(int i=0;i<b.length;i++){
            if(hs.contains(b[i])){
                count++;
                hs.remove(b[i]);
                System.out.print(" "+b[i]);
            }
        }
        
    }
    
}
