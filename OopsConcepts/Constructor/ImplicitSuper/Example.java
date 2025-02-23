package OopsConcepts.Constructor.ImplicitSuper;

class Animal {
    public Animal() {
        System.out.println("An Animal is created.");
    }
}

class Dog extends Animal {
    public Dog() {
        // so here compiler implicitly insert super() here
        System.out.println("An dog is created.");
    }
}

public class Example {
    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}

