package com.kodnest.OopsConcepts.Encapsulation.InnerClasses.LocalInnerClass;

public class CoffeeShop {
    void serveCustomer(String customerType) {
        class Coffee {
            private String type;
            Coffee(String type) {
                this.type = type;
            }
            public void serve() {
                System.out.println("Serving " + type + " to " + customerType + " customer....");
            }
        }
        Coffee espresso = new Coffee("Espresso");
        espresso.serve();
    }
}
