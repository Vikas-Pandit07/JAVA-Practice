package com.kodnest.Practice;
import java.util.Scanner;

public class AreaandPeremeter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();
        int breadth = scan.nextInt();

        int area = length * breadth;
        int peremeter = 2*(length+breadth);

        System.out.println("Area: " +area+ " Peremeter: "+peremeter);
        
        scan.close();
    }
}
