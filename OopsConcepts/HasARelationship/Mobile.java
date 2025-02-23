package com.kodnest.oops.HasARelationship;

public class Mobile {
    String brand = "Samsung";
    String color = "Blue";
    int cost = 124000;

    //handling composition by creating compostite object inside
    // enclosing object
    Os os = new Os();

    //handlin aggregate object by creating mechanism to
    // accept the charger
    void port(Charger c){
        System.out.println("phone has accepted charger....");
        System.out.println(c.brand+" "+c.color+" "+c.output);
        c.charge();
    }   
    void about(){
       System.out.println(os.name+" "+os.version);
       os.makeSystemOperate();
    }
}

