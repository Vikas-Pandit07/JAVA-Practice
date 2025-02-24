package OopsConcepts.Encapsulation.SetterGetter.StudentEx;

import org.w3c.dom.ls.LSOutput;

public class StudentApp {
    public static void main(String[] args) {

    Student student = new Student();
    student.setName("Vikas");
    student.setId(15);
    student.setAge(22);
    student.setMarks(89);

    System.out.println(student.getName() + " " + student.getId() + " " + student.getAge() + " " + student.getMarks());

        Student student2 = new Student("Akash",9, 24, 78);
        System.out.println(student2.getName() + " " + student2.getId() + " " + student2.getAge() + " " + student2.getMarks());
    }
}
