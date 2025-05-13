package com.kodnest.DSA.LInkedList;

import com.kodnest.DSA.LInkedList.Links;
import java.util.Scanner;

public class ListApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Links ll = new Links();

        while (true) {
            System.out.println("\n=====================");
            System.out.println("DOUBLY LINKED LIST MENU");
            System.out.println("Press 1 to Insert at First");
            System.out.println("Press 2 to Insert at Last");
            System.out.println("Press 3 to Delete from First");
            System.out.println("Press 4 to Delete from Last");
            System.out.println("Press 5 to Display List");
            System.out.println("Press any other number to Exit");
            System.out.print("Choose an option: ");

            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert at first: ");
                    int firstElem = scan.nextInt();
                    ll.insertFirst(firstElem);
                    break;

                case 2:
                    System.out.print("Enter element to insert at last: ");
                    int lastElem = scan.nextInt();
                    ll.insertLast(lastElem);
                    break;

                case 3:
                    ll.deleteFirst();
                    break;

                case 4:
                    ll.deleteLast();
                    break;

                case 5:
                    ll.display();
                    break;

                default:
                    System.out.println("Exiting... Goodbye!");
                    return;
            }
        }
    }
}
