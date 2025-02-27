import java.util.Scanner;
public class DigitCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int temp = n;
        int count = 0;

        while(n != 0) {
            int digit = n % 10;
            count++;
            n /= 10;
        }
        System.out.println("The number " + temp + " has " + count + " digits.");

    }
}