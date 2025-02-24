package OopsConcepts.Encapsulation.SetterGetter.StudentEx;

/// POJO class (Plain old java class)
// means class has a constructors, getters and setters
public class Student {
    private String name;
    private int id;
    private int age;
    private int marks;


    public Student() {
    }

    //    Specialize setter or constructor
    public Student(String name, int id, int age, int marks) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.marks = marks;
    }

    //    setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}