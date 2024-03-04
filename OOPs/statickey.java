public class statickey {
    public static void main(String arg[]) {
        student s1 = new student();
        s1.school = "JNV";
        student s2 = new student();
        System.out.print(s2.school);
    }
}

class student {
    String name;
    int Roll_No;
    static String school;

    static int percentage(int math, int phy, int chem) { // static fuction
        return (math + phy + chem) / 3;
    }

    void setname(String s) {
        this.name = s;
    }

    String getname() {
        return this.name;
    }
}
