package com.kodnest.OopsConcepts.Encapsulation.InnerClasses.MemberInnerClass;

public class SchoolApp {
    public static void main(String[] args) {
        School school = new School("Bhawanji Bhai Chawhan HighSchool");
        School.Classroom mathClass = school.new Classroom(101, "Math");
        School.Classroom scienceClass = school.new Classroom(101, "Science");
        mathClass.display();
        scienceClass.display();
    }
}
