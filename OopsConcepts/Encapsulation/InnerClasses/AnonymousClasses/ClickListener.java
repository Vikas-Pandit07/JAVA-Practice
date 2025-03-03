package com.kodnest.OopsConcepts.Encapsulation.InnerClasses.AnonymousClasses;

interface ClickListener {
    void onClick();
}

class Button {
    private String label;

    public Button(String label) {
        this.label = label;
    }

    public void click() {
        System.out.println("Clicking button " + label + " ");
    }

    public void setClick(ClickListener listener) {
        listener = new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Button " + label + " was clicked!...");
            }
        };
    }
}