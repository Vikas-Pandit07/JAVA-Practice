import java.util.Scanner;

public class SingleDigitSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number");

      int number = scan.nextInt();
    /*  int sum = number;
        
        while (sum >= 10) {
            int temp = sum;
            sum = 0;
        
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
    }*/

        int temp = number;

        while (temp >= 10) {
            temp = sumOfDigits(temp);
        }
        System.out.println("The single digit sum of digits of "+number+" is "+temp);
        scan.close();
    }
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0){
        sum += num % 10;
        num /= 10;
    }
    return sum;
}
}

