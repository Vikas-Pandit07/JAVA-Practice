package com.kodnest.oops.HasARelationship;

public class MobileApp {
    public static void main(String[] args) {

        Mobile phone = new Mobile();

        System.out.println(phone.brand);
        System.out.println(phone.color);
        System.out.println(phone.cost);
        System.out.println("==============================");

        System.out.println(phone.os.name);
        System.out.println(phone.os.version);
        System.out.println("==============================");

        Charger charger = new Charger();
        System.out.println(charger.brand);
        System.out.println(charger.color);
        System.out.println(charger.output);
        System.out.println("==============================");

        phone.port(charger);
        System.out.println("==============================");

        phone.about();
        System.out.println("==============================");

        phone = null;
        System.out.println("Mobile phone is lost, dismissed, tata tata, bye bye....");
        
// nullpointer error beacause phone = null assigned.
       // System.out.println(phone.brand);
        //System.out.println(phone.color);
       // phone.port(charger);
        //phone.about();


        // charger can usable beacuase it is outside of the phone.
        System.out.println(charger.brand+" "+charger.color+" "+charger.output);
    }
}
