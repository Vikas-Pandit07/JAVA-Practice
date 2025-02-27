import java.util.Scanner;

/**
 * SmallestDigit
 */
public class SmallestDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scan.nextInt();
        
        int temp = number;
        int smallDigit = 9;

        while (temp != 0) {
            int digit = temp % 10;
            if (digit < smallDigit) {
                smallDigit = digit;
            }
            temp /= 10;
        }
        System.out.println("The smallest digits in "+number+" is "+smallDigit+".");
        scan.close();
    }
    
}