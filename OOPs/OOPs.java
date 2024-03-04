
public class OOPs {
    public static void main(String arg[]) {
        // Pen p1=new Pen(); Created a pen object called p1
        // p1.setcolour("Blue\n");
        // System.out.print(p1.colour);
        // System.out.print(p1.tip);

        Bank account = new Bank();
        System.out.print(account.username+"\n");
        // System.out.print(account.Password); This will give error (Private)
        account.setPassword(24);
        System.out.print(account.getPassword());
    }

}

class Bank {
    public String username = "Prateek";
    private int Password = 12345;

    public void setPassword(int newPass) {    //Setters
        Password = newPass;
    }
    public int getPassword() {   //Getter
        return Password ;
    }
}

class Pen {
    String colour = "Red";
    int tip = 10;

    void setcolour(String newcolour) {
        colour = newcolour;
    }

    void settip(int newtip) {
        tip = newtip;
    }
}
