package OopsConcepts.Abstraction.ClassroomEx;

public class PythonTeacher extends Teacher{
    @Override
    public void markattendence() {
        System.out.println("Python teacher is taking attendence");
    }

    @Override
    public void teach() {
        System.out.println("Python teacher is teaching");
    }
}