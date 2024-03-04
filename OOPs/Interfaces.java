public class Interfaces {
    public static void main(String arg[]){
    Rook R=new Rook();
    R.moves();

    bear b=new bear();
    b.eat();
    } 
}

interface chessplayer{    //100% abstractrion
    void moves();         // all method are public, abstract and without implementation
}
class queen implements chessplayer{
    public void moves(){    // we must write public(as of visibility of interface) otherwise it will be default
        System.out.print("In all direction\n");
    }
}
class Rook implements chessplayer{
    public void moves(){
        System.out.print("In verticle and horizontal direction\n");
    }
}
class Pawn implements chessplayer{
    public void moves(){
        System.out.print("down\n");
    }
}
class king implements chessplayer{
    public void moves(){
        System.out.print("In all direction (by 1 step)\n");
    }
}
//--------------------------------------------------------------------------//

interface herbivorous{
    void eat();
}
interface carnivorous{
    void eat();
}
class bear implements herbivorous,carnivorous{ //Interface is used to achieve multiple inheritance
    public void eat(){
        System.out.print("Eat both grass and animal\n");
    }
}