import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = scan.nextInt();
    int sum = 0;
    while (number != 0) {
        sum += number % 10;
        number /= 10;
    }
    System.out.println("Sum of digits: "+sum);
    scan.close();
}

}

