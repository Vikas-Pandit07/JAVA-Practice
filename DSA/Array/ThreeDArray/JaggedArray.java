package com.kodnest.DSA.Arrays.ThreeDArray;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1D length of 3D Array");
        int arr[][][] = new int[scan.nextInt()][][];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the 2D length for 1D "+i);
            arr[i] = new int[scan.nextInt()][];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the length of 3D for 1D " +i+ " and 2D " +j);
                arr[i][j] = new int[scan.nextInt()];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("Enter the data to stored in 1D " + i + " 2D of " + j + " 3D of "+ k);
                    arr[i][j][k] = scan.nextInt();
                }
            }
        }

        System.out.println("The elements are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }


//    redundancy
//        int arr[][][] = new int[2][][];
//
//       arr[0] = new int[2][];
//       arr[1] = new int[3][];
//
//       arr[0][0] = new int[5];
//       arr[0][1] = new int[3];
//
//        arr[1][0] = new int[2];
//        arr[1][1] = new int[4];
//        arr[1][2] = new int[5];
//
//        arr[0][0][0] = 1;
//        arr[0][0][1] = 1;
//        arr[0][0][2] = 1;
//        arr[0][0][3] = 1;
//        arr[0][0][4] = 1;
//
//        arr[0][1][0] = 2;
//        arr[0][1][1] = 2;
//        arr[0][1][2] = 2;
//
//        System.out.println(arr[0][0][0] + " " + arr[0][0][1] + " " + arr[0][0][2]);
//    }
}
