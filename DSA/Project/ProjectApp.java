package com.kodnest.DSA.Project;

import java.util.Scanner;

public class ProjectApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER ARRAY SIZE: ");
        Array arr  = new Array(scan.nextInt());
        System.out.println("ENTER " +arr.length()+" ELEMENTS");
        for (int i = 0; i < arr.length(); i++) {
            arr.insert(i, scan.nextInt());
        }
        arr.display();
        System.out.println("ENTER INDEX TO DELETE FORM 0 TO " + (arr.length() - 1));
        arr.delete(scan.nextInt());
    }
}
