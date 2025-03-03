package com.kodnest.OopsConcepts.LambdaExpressions;

 interface Greeting {
    public void greet();
}
public class Ex1 {
    public static void main(String[] args) {

    //traditional way
    Greeting greeting = new Greeting() {
        @Override
        public void greet() {
            System.out.println("Namste from tradional way...");
        }
    };

    //lamda way
        Greeting lambdaGreeter = () -> System.out.println("Namste from lambda way...");

        //using both greeters
        greeting.greet();
        lambdaGreeter.greet();
}}
