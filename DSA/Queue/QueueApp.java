package com.kodnest.DSA.Queue;

import com.kodnest.DSA.Stacks.Stacks;

import java.util.Scanner;

public class QueueApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Queue size");
        int size = scan.nextInt();

        Queues queue = new Queues(size);

        while (true) {
            System.out.println("Press-1 to Insert()");
            System.out.println("Press-2 to Delete()");
            System.out.println("Press-3 to Display()");
            System.out.println("Any other number to stop");

            System.out.println("Choose An Option");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter element to Insert");
                    int element = scan.nextInt();
                    queue.insert(element);
                    break;

                case 2: queue.delete();
                    break;

                case 3: queue.display();
                    break;

                default:
                    System.out.println("BYE bye....");return;}
        }
    }
}
