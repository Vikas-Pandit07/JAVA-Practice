package OopsConcepts.Constructor.DemoEx;

class Object {
    public void object() {
        //initialization logic
    }
}
class Demo extends Object {
    int a;
    int b;

    public Demo() {
        super();
    }
}

public class DemoApp extends Object {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.a+" "+d.b);
    }
    public DemoApp() {
        super();
    }
}

