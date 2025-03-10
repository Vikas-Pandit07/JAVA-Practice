package com.kodnest.DSA.Arrays.ONEDArray;

import java.util.Scanner;

public class redundancyEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int arr[] = new int[sc.nextInt()];

        // this is not a industry standared code
        // because 4 is directly hard code in 0 nothing problem
        // for (int i = 0; i <= 4; i++)
        // so for that
        for (int i = 0; i <= arr.length-1; i++)
        {
            System.out.println("Enter the age of student " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i <= arr.length-1; i++)
        {
            System.out.println("The age of Student " + i + " is " + arr[i]);
        }



        // Redundancy in this code
//        int arr[] = new int[5];
//
//        System.out.println("Enter the age of student 0: ");
//        arr[0] = sc.nextInt();
//        System.out.println("Enter the age of student 1: ");
//        arr[1] = sc.nextInt();
//        System.out.println("Enter the age of student 2: ");
//        arr[2] = sc.nextInt();
//        System.out.println("Enter the age of student 3: ");
//        arr[3] = sc.nextInt();
//        System.out.println("Enter the age of student 4: ");
//        arr[4] = sc.nextInt();
//
//        System.out.println("The age of student o is: " + arr[0]);
//        System.out.println("The age of student o is: " + arr[1]);
//        System.out.println("The age of student o is: " + arr[2]);
//        System.out.println("The age of student o is: " + arr[3]);
//        System.out.println("The age of student o is: " + arr[4]);
    }
}
