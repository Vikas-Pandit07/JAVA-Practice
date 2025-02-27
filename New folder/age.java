package com.kodnest.Practice;
import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Age");
        int Age = scan.nextInt();
        checkAge(Age);
        scan.close();
    }

    public static void checkAge(int Age){
        if (Age >= 18){
            System.out.println("Eligible for Vote");
        }
        else{
            System.out.println("NOt eligible for vote");
        }
    }
}