public class Inheritance {
    public static void main(String arg[]){
    fish shark=new fish();
    shark.eat();
    }
}
class animal{
    String colour;
    void eat(){
        System.out.print("Eat\n");
    }
    void sleep(){
        System.out.print("Sleeps\n");
    }
}
class fish extends animal{
    int fins;
    void swim(){
        System.out.print("Swim\n");
    }
}
