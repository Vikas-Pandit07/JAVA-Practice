package com.kodnest.DSA.LInkedList;

public class Links {
    class Node {
        Node pl;
        int data;
        Node nl;
    }

    Node first = null;
    Node temp = null;

    // Insert at beginning
    void insertFirst(int element) {
        Node nn = new Node();
        nn.data = element;
        nn.pl = null;
        nn.nl = first;

        if (first != null) {
            first.pl = nn;
        }

        first = nn;
        System.out.println("Inserted at first: " + element);
    }

    // Insert at end of
    void insertLast(int element) {
        Node nn = new Node();
        nn.data = element;
        nn.pl = null;
        nn.nl = null;

        if (first == null) {
            first = nn;
        } else {
            temp = first;
            while (temp.nl != null) {
                temp = temp.nl;
            }
            temp.nl = nn;
            nn.pl = temp;
        }

        System.out.println("Inserted at last: " + element);
    }

    // Delete from beginning
    void deleteFirst() {
        if (first == null) {
            System.out.println("Delete not possible - List is empty");
        } else if (first.nl == null) {
            System.out.println("Element deleted from first: " + first.data);
            first = null;
        } else {
            System.out.println("Element deleted from first: " + first.data);
            first = first.nl;
            first.pl = null;
        }
    }

    // Delete from end
    void deleteLast() {
        if (first == null) {
            System.out.println("Delete not possible - List is empty");
        } else if (first.nl == null) {
            System.out.println("Element deleted from last: " + first.data);
            first = null;
        } else {
            temp = first;
            while (temp.nl.nl != null) {
                temp = temp.nl;
            }
            System.out.println("Element deleted from last: " + temp.nl.data);
            temp.nl = null;
        }
    }

    // Display list
    void display() {
        if (first == null) {
            System.out.println("Display not possible - List is empty");
        } else {
            System.out.print("List elements: ");
            temp = first;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.nl;
            }
            System.out.println(); // For new line
        }
    }
}
