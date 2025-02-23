package OopsConcepts.AnonymousInnerType;

abstract class Demo {
    public abstract void display();
}

public class DemoApp {
    public static void main(String[] args) {
        Demo d = new Demo() {
            public void display() {
                System.out.println("THis is the Anonymous inner type method...");
            }
        };
        d.display();
    }
}