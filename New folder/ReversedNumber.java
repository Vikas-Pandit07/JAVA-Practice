import java.util.Scanner;

public class ReversedNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number");

        int number = scan.nextInt();
        int reversedNum = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNum = reversedNum * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed Number: "+reversedNum);
        scan.close();
    }
}

