package com.kodnest.oops.Inheritance;

public class SingleInheritence {
    public static void main(String[] args) {
        Cricketer c = new Cricketer();
        System.out.println("Cricketer's hobby: "+c.hobby);
        c.play();

        Footballer b = new Footballer();
        System.out.println("Footballer's hobby: "+b.hobby);
        b.play();
    }
}

class Player {
    String hobby = "sports";
    public void play() {
        System.out.println("Play Sports!");
    }
}
class Cricketer extends Player {
}

class Footballer extends Player {
    
}

