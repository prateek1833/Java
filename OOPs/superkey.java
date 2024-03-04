public class superkey {
    public static void main(String arg[]){
        Horse h=new Horse();

        
    }
    
}
 class animal{
    String colour;
    animal(){   
         System.out.print("Animal constructor called\n");
    }
}
class Horse extends animal{
    Horse(){
        super(); // must be inside the constructor body
        System.out.print("Horse constructoe called\n");
    }
}
// if we not write super in horse , java write it attomatically.