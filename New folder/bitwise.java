import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two integers
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        // Perform bitwise XOR
        int xorResult = num1 ^ num2;

        // Perform left shift
        int leftShiftResult = num1 << 1; // Left shifting the first number by 1 bit

        // Perform right shift
        int rightShiftResult = num2 >> 1; // Right shifting the first number by 1 bit

        // Print results
        System.out.println("Bitwise XOR result: " + xorResult);
        System.out.println("Left Shift result: " + leftShiftResult);
        System.out.println("Right Shift result: " + rightShiftResult);

        scanner.close();
    }
}
