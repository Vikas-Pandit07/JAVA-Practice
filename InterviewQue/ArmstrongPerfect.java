package com.kodnest.InterviewQue;

import java.util.*;

public class ArmstrongPerfect {

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num, sum = 0, digits = 0, temp = num;

        while (temp > 0) { // Count digits
            temp /= 10;
            digits++;
        }

        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == originalNum;
    }

    // Method to check if a number is a Perfect number
    public static boolean isPerfect(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers separated by spaces: ");
        String[] input = sc.nextLine().split(" ");

        List<Integer> armstrongNumbers = new ArrayList<>();
        List<Integer> perfectNumbers = new ArrayList<>();

        for (String numStr : input) {
            int num = Integer.parseInt(numStr);

            if (isArmstrong(num)) armstrongNumbers.add(num);
            if (isPerfect(num)) perfectNumbers.add(num);
        }

        System.out.println("Armstrong Numbers: " + armstrongNumbers);
        System.out.println("Perfect Numbers: " + perfectNumbers);

        sc.close();
    }
}
