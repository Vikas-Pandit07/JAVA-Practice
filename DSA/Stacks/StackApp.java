package com.kodnest.DSA.Stacks;

import java.util.Scanner;

public class StackApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter stack size");
        int size = scan.nextInt();

        Stacks stack = new Stacks(size);

        while (true) {
        System.out.println("Press-1 to PUSH()");
        System.out.println("Press-2 to POP()");
        System.out.println("Press-3 to Display()");
        System.out.println("Any other number to stop");

        System.out.println("Choose An Option");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter element to PUSH");
                int element = scan.nextInt();
                stack.push(element);
                break;

            case 2: stack.pop();
            break;

            case 3: stack.display();
            break;

            default:
                System.out.println("BYE bye....");return;}
        }
    }
}
