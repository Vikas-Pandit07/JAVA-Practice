package com.kodnest.InterviewQue;

import java.util.*;
// digital circuit
public class DigitalCircuteSorter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read input size
            int n = scanner.nextInt();
            int[] arr = new int[n];

            boolean isValid = true;

            // Read the array elements
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                if (arr[i] != 0 && arr[i] != 1) {
                    isValid = false;
                }
            }

            if (!isValid) {
                System.out.println("Invalid Code");
            } else {
                Arrays.sort(arr); // Sort to get 0s on the left and 1s on the right
                System.out.println(Arrays.toString(arr));
            }

            scanner.close();
        }
    }

