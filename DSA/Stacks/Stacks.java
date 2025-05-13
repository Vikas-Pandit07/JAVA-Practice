package com.kodnest.DSA.Stacks;

public class Stacks {
    private int s[];
    private int size;
    private int top = -1;

    public Stacks(int size) {
        if (size > 0) {
            this.size = size;
            s = new int[size];
            System.out.println("Stack of size "+size+" created." );
        }
    }

    public void push(int element) {
        if (top < size - 1) {
            top++;
            s[top] = element;
            System.out.println("Element "+element+" is pushed on the stack.");
        }
        else {
            System.out.println("Push not possible stack is full.");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Pop not possible stack is empty");
        }
        else {
            System.out.println("Element deleted is " +s[top]);
            s[top] = 0;
            top--;
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Display is not possible stack is empty.");
        }
        else {
            for (int i = top; i >= 0; i--) {
                System.out.println(s[i]);
            }
        }
    }
}
