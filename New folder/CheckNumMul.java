import java.util.Scanner;
public class CheckNumMul {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();
        checkMultipleOffFive(number);
        scan.close();
    }
    public static void checkMultipleOffFive(int number){
        if (number % 5 == 0){
            System.err.println("Multiple of 5");
        }
        System.out.println("Program Ended");
    }
}
