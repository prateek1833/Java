public class methOveride {
    public static void main(String arg[]) {
        deer d = new deer();
        d.eat();

    }
}

class animal {
    void eat() {
        System.out.print("Eat grass and animal\n");
    }
}

class deer extends animal {
    void eat() {
        System.out.print("Eat grass\n");
    }
}
