package OopsConcepts.Constructor.StudentEx;

//class Object1 {
//    void object() {
//        //instantiate the logic
//    }
//}
class Student {//extends Object1{
    String name;
    int age;
    String gender;

//    void studentData(String a, int b, String c) {
//        name = a;
//        age = b;
//        gender = c;
//    }
//
//    public Student() {
//        super();
//    }

    public Student(String a, int b, String c) {
        // if we not create the super() then constructor create by default
        super();
        name = a;
        age = b;
        gender = c;
    }
}

public class StudentApp {//extends Object1 {
    public static void main(String[] args) {
//        Student s = new Student();
//        s.studentData("Vikas", 22, "Male");

        Student s = new Student("Vikas", 22, "Male");
        System.out.println(s.name+" "+s.age+" "+s.gender);
    }
//    //here default constructor will be created
//    public StudentApp() {
//        super();
//    }
}
