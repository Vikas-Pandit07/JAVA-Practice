package OopsConcepts.Constructor.InstanceBlock;

class Bird {
    String type;
    int age;
//3.1 when jvm comes in o parameterized contstructor
    // in that it will see that this assign default type as "wild'

    // 3.5 here and print the statement.
    // and then go to main
    public Bird() {
        this("wild");
        System.out.println("contructor block 1");
    }
    // 3.2 then comes here and see this keyword assign default age
    // as 22

    //3.4 then come here and assign type = "wild"
    // and print the statement and constructor closing then move to
    public Bird(String type) {
        this(22);
        this.type = type;
        System.out.println("constructor block 3");
    }
    // 3.3 then come here and assign a age = 22;
    // after that execute print statement
    // and sees closing of constructor
    public Bird(int age) {
        this.age = age;
        System.out.println("constructor block 2");
    }
    // 2.1 then instance block executed in sequence wise.
    {
        System.out.println("Instance block 1");
    }
    {
        System.out.println("Instance block 2");
    }
    // 1. so fristly static black will executed before the
    // object creation
    static {
        System.out.println("Static block");
    }
}


public class BirdApp {
    public static void main(String[] args) {
        // 2. then jvm sees new bird means object creates
        // so first it executed the instance bloc

        //3. after instance block execution jvm sees the object
        // created with o parameters/ arguments the it go for
        // 0 parameterized constuctor.
        Bird bird = new Bird();

        // after coming in main print this statement
        System.out.println("Hello Bird......");


    }
}

