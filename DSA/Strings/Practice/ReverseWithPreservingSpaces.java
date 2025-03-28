package com.kodnest.DSA.Strings.Practice;
import java.util.Scanner;
//Create a Scanner object.
//
//Take the input string from the user.
//
//Convert the input string to a character array → arr1.
//
//Create another character array arr2 of the same length as arr1.
//
//Copy all the spaces from arr1 to the same positions in arr2.
//
//Reverse and copy non-space characters from arr1 to arr2:
//
//If the character in arr1 is a space → skip it.
//
//Else → find the next non-space position in arr2 from the end and place the character there.
//
//Convert arr2 to a string and return/display it.
public class ReverseWithPreservingSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String original = scanner.nextLine();

        System.out.println("ORIGINAL STRING");
        System.out.println(original);

        // Logic of reversing
        StringManipulation manipulation = new StringManipulation();
        String reverse = manipulation.reverseByPreservingSpaces(original);
        System.out.println("Reversed String Is:");
        System.out.println(reverse);

        if (original.equals(reverse)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }

        scanner.close();
    }
}
    class StringManipulation {
        public static String reverseByPreservingSpaces(String original) {
            char arr1[] = original.toCharArray();
            char arr2[] = new char[arr1.length];

            // Logic to copy spaces from arr1 to arr2
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == ' ') {
                    arr2[i] = ' ';
                }
            }

            int j = arr2.length - 1;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != ' ') {
                    while (arr2[j] == ' ') {
                        j--;
                    }
                    arr2[j] = arr1[i];
                    j--;
                }
            }

            return new String(arr2);
        }
    }


