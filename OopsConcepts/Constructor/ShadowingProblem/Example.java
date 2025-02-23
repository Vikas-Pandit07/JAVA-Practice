package OopsConcepts.Constructor.ShadowingProblem;

class Studentss{
    String name;
    int age;
    String gender;
    int marks;
    int sem;
    String address;

    public Studentss( String name, int age, String gender, int marks,
                      int sem, String address) {
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.marks = marks;
        this.sem = sem;
        this.address = address;
    }

    public void eat() {
        System.out.println("Student is eating");
    }
    public void sleep() {
        System.out.println("Student is sleeping");
    }
    public void study() {
        System.out.println("Student is doing study");
    }
}

public class Example {
    public static void main(String[] args) {
        Studentss student = new Studentss("Vikas", 22, "Male", 81, 0, "pune");
        System.out.println(student.name+" "+student.age+" "+student.gender+" "+student.marks+" "+student.sem+" "+student.address);
        student.eat();
        student.sleep();
        student.study();

        Studentss student1 = new Studentss("Akash", 25, "Male", 81, 0, "pune");
        System.out.println(student1.name+" "+student1.age+" "+student1.gender+" "+student1.marks+" "+student1.sem+" "+student1.address);
        student1.eat();
        student1.sleep();
        student1.study();
    }
}

