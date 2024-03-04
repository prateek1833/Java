public class Abstraction {
    public static void main(String arg[]){
        Horse h=new Horse();
        h.eat();
        h.walk();
        h.changecolour();
        System.out.print(h.colour+"\n");

        chetak c=new chetak(); // This will called constructor, Animal-->Horse-->Chetak

        // animal a=new animal; --> this will give error because , object cannot be created in abstract class
    }
    
}
abstract class animal{
    String colour;
    animal(){   // constructor can be called in Abstraction
         colour="Brown";
         System.out.print("Animal constructoe called\n");
    }
    void eat(){
        System.out.print("Animal eat\n");
    }
    abstract void walk();    //Only give idea , not implementation
}
class Horse extends animal{
    void walk(){
    System.out.print("Walk on 4 legs\n");
    };
    void changecolour(){
         this.colour="White";
    }
    Horse(){
        System.out.print("Horse constructoe called\n");
    }
}
class chicken extends animal{
    void walk(){
        System.out.print("Walk on 2 legs\n");
    }
}
class chetak extends Horse{
    chetak(){
        System.out.print("chetak constructor called\n");
    }

}