public class methodOverload {
    public static void main(String arg[]){
        calculator calc=new calculator();
        System.out.print(calc.sum(2,3));
    }

}

class calculator {
    int sum(int n, int m) {
        return n + m;
    }
    int sum(int n, int m,int p) {
        return n + m + p;
    }
    double sum(double n, double m) {
        return (n + m);
    }

}