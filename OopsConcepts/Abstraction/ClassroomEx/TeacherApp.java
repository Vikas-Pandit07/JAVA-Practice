package OopsConcepts.Abstraction.ClassroomEx;

public class TeacherApp {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        classroom.acceptTeacher(new JavaTeacher());
        classroom.acceptTeacher(new PythonTeacher());

//        Teacher teacher = new Teacher();
//        teacher.markAttendence();
//        teacher.teach();
    }
}

