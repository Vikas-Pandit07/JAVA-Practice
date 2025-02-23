package OopsConcepts.Abstraction.ClassroomEx;

public class JavaTeacher extends Teacher{
    @Override
    public void markattendence() {
        System.out.println("Java teacher is taking attendence");
    }

    @Override
    public void teach() {
        System.out.println("Java teacher is teaching");
    }
}

