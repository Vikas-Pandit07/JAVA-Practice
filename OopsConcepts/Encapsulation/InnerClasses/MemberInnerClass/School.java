package com.kodnest.OopsConcepts.Encapsulation.InnerClasses.MemberInnerClass;

public class School {
    private String name;

    public School(String name) {
        this.name = name;
    }

    class Classroom {
        private int roomNumber;
        private String subject;

        public Classroom(int roomNumber, String subject) {
            this.roomNumber = roomNumber;
            this.subject =  subject;
        }

        public void display() {
            System.out.println(name + " - room " + roomNumber + " - subject" + subject);
        }
    }
}
