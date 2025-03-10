package com.kodnest.DataStructureAndAlgorithm.Arrays;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of players: ");
        float arr[] = new float[scan.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("The height of player " + i);
            arr[i] = scan.nextFloat();
        }

        System.out.println("Heights of player is: ");

        // Traversing an array
        // for each arr taking input and storing into the x

        for (float x : arr) {
            System.out.print("["+ x + "] ");
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + ", ");
//        }
    }
}
