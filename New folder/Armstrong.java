package com.kodnest.Practice;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int originalNum = n;
        int noOfDigits = digitCounter(n);
        int armstrong = 0;

        while (n != 0) {
            int digit = n % 10;
            int res = power(digit, noOfDigits);
            armstrong += res;
            n /= 10;
        }
        if(originalNum == armstrong) {
            System.out.println("It is a Armstrong number.");
        }
        else {
            System.out.println("Is is not a Armstrong number.");
        }
        scan.close();
    }

    public static int digitCounter(int n) {
        int count = 0;

        while(n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int power(int digit, int p) {
        int res = digit * p;
        return (int) Math.pow(digit, p);
    }
}