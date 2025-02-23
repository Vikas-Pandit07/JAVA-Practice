package OopsConcepts.Constructor.CopyConstructure;

class Demo {
    String a;
    int b;
    int c;

    public Demo(String a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    // copy constructor used
    //take object as same name as a parameter
    //when constructor name and parameter(Demo Demo) is same is called
    public Demo(Demo ref) {
        this.a = ref.a;
        this.b = ref.b;
        this.c = ref.c;
    }

    public void display() {
        System.out.println(a + " " + b + " " + c);
    }
}

public class DemoApp {
    public static void main(String[] args) {
        Demo demo = new Demo("Onkar", 21, 2000);
        demo.display();

        Demo dup = new Demo(demo);
        dup.display();

        dup.a = "Sushant";
        dup.b = 24;
        dup.c = 1997;

        System.out.println("after modifying");
        dup.display();
        demo.display();
    }
}

