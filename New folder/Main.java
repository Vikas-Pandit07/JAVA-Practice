import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number n:");
        int n = scan.nextInt();

        System.out.println("Enter number m:");
        int m = scan.nextInt();

        // XOR operation (remains as in your screenshot)
        int xor = n ^ m;
        System.out.println("Bitwise XOR result: " + xor);

        // Custom Left Shift Logic
        int leftShift = n << m; // Replace standard shift with multiplication
        System.out.println("Left Shift result: " + leftShift);

        // Custom Right Shift Logic
        int rightShift = n >> m; // Replace standard shift with division
        System.out.println("Right Shift result: " + rightShift);

        scan.close();
    }
}
