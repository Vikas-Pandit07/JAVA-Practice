package OopsConcepts.Abstraction.ClassroomEx;

public class Classroom {
    public void acceptTeacher(Teacher ref) {
        ref.markattendence();
        ref.teach();
    }
}