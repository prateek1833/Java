// package OOPs;

public class Constructor {
    public static void main(String arg[]) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.Roll_No = 24;
        s1.marks[0] = 91;
        s1.marks[1] = 89;
        s1.marks[2] = 79;

        Student s2 = new Student("Prateek"); // Initialisation of name
        Student s3 = new Student(s1); // copy constructor

        s1.marks[1] = 91;
        for (int i = 0; i < 3; i++) {
            System.out.print(s3.marks[i] + "\n");
        }
        // As the marks[1] changes after the copy, but in s3 it is already updated,this is shallow copy 
        // this limitation is overcome by deep copy constructor
    }

}

class Student {
    String name;
    int Roll_No;
    int marks[] = new int[3];

    Student() { // Non parametrised constructor
        System.out.print("Constructor is called\n");
    }

    Student(String name) { // parametrised constructor
        this.name = name;
        System.out.print("Constructor is called\n");
    }

    // Student(Student s1) {              // shallow copy constructor
    //     this.name = s1.name;
    //     this.Roll_No = s1.Roll_No;
    //     this.marks = s1.marks;
    //     System.out.print("Constructor is called\n");
    // }

    Student(Student s1) {               // deep copy constructor
        this.name = s1.name;
        this.Roll_No = s1.Roll_No;
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
        System.out.print("Constructor is called\n");
    }
    Student pk;
}
