package com.kodnest.DSA.Strings.Practice;
import java.util.Scanner;
public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");
        String original = scan.nextLine();

        System.out.println("\nORIGINAL STRING\n");
        System.out.println(original + "\n");

        // Logic to Reverse Each Word
        StringManipulation1 manipulation = new StringManipulation1();
        String revString = manipulation.reverseEachWord(original);

        System.out.println("REVERSED STRING\n");
        System.out.println(revString);
    }
}
class StringManipulation1 {
    public static String reverseEachWord(String original) {
        String wordsArray[] = original.split(" ");
        String revString = "";

        for (int i = 0; i < wordsArray.length; i++) {
            String word = wordsArray[i];
            String revWord = "";

            // Reverse each word
            for (int j = word.length() - 1; j >= 0; j--) {
                revWord += word.charAt(j);
            }

            revString += revWord + " ";
        }

        return revString.trim();
    }
}