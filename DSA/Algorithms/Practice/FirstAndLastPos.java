package com.kodnest.DSA.Algorithms.Practice;
import java.util.Scanner;

public class FirstAndLastPos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size");
        int[] arr = new int[scan.nextInt()];

        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter the key which find");
        int target = scan.nextInt();

        int first = findPosition(arr, target, true);
        int last = findPosition(arr, target, false);
        System.out.println("["+first+", "+last+"]");
    }

    public static int findPosition(int[] arr, int target, boolean findfirst) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end-start) / 2;
            // find mid
            if (target == arr[mid]) {
                result = mid;
                if (findfirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            //find greater than mid
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            // find less than mid
            else {
                end = mid - 1;
            }
        }
        return result;
    }
}
