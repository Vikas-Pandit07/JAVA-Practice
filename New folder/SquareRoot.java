import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");

        int number = scan.nextInt();

        // double square = Math.sqrt(number);

        // if ((square * square) == number) {
        //     System.out.println(number+" is a perfect square.");
        // }
        // else {
        //     System.out.println(number+" is not a perfect square.");
        // }

        double temp;
        double sr = number / 2;

        do {
            temp = sr;
            sr = (temp + (number / temp))/2;
        }while (sr - temp != 0);

        int square = (int)sr;
        if ((square * square) == number) {
            System.out.println(number+" is a perfect square.");
         }
         else {
            System.out.println(number+" is not a perfect square.");
         }
        scan.close();
    }
}
