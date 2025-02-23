package OopsConcepts.Constructor.StudentEx;

//class Object2 {
//    void object() {
//        //instantiate the logic
//    }
//}
class Student1 {//extends Object2{
    String name;
    int age;
    String gender;
    //Parameterized Constructor is used to make object creation
    //more flexible
    public Student1(String a, int b, String c) {
        // if we not create the super() then constructor create by default
        super();
        name = a;
        age = b;
        gender = c;
    }
}

public class StudentsApp {//extends Object1 {
    public static void main(String[] args) {
        Student1 s = new Student1("Vikas", 22, "Male");
        System.out.println(s.name+" "+s.age+" "+s.gender);
//without assign a value it cannot compile
        //Student1 st1 = new Student1();
        Student1 st1 = new Student1("Vikas", 22, "Male");
        System.out.println(st1.name+" "+st1.age+" "+st1.gender);
    }
//    //here default constructor will be created
//    public StudentsApp() {
//        super();
//    }
}
