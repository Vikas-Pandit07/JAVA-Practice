package OopsConcepts.Constructor.SuperKeyword;

public class BirdType2 extends BirdType {

    @Override
    public void eat() {
        super.eat();// using super you just access one level above not able access birdtype parent element
        System.out.println("And Grains");
    }
}

