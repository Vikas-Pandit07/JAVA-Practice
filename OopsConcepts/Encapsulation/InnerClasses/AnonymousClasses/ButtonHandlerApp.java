package com.kodnest.OopsConcepts.Encapsulation.InnerClasses.AnonymousClasses;

public class ButtonHandlerApp {
    public static void main(String[] args) {
        Button submitButton = new Button("Submit");

        submitButton.setClick(new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Submit button Clicked!...");
            }
        });
       submitButton.click();
    }
}
