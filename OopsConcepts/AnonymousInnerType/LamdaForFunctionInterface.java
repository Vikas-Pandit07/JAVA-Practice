package OopsConcepts.AnonymousInnerType;


interface Greetable {
    void greet(); //functional interface
}
interface GreetableWithName {
    void greet(String name); //functional interface
}

public class LamdaForFunctionInterface {
    public static void main(String[] args) {
        //apply lamda expression to solve functional interface
        Greetable g = () -> System.out.println("hello solve by lambda expression");
        g.greet();

        GreetableWithName g1 = (name) -> System.out.println("hello "+name+ " this example solve by lambda expression");
        g1.greet("Vikas");
    }
}