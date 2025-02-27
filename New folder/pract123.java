//import java.util.Scanner;

public class pract123{
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
       // int N = scan.nextInt();
       /*  System.out.println("Numbers:");
        for (int i = 1; i<=N; i++)
        {
            if(i%3==0 && i%5==0)
            {
                continue;
            }
            System.out.print(i);
        }*/

        /*System.out.print("Odd Numbers:");
        for (int i = 1; i<= N; i++){
            if(i%2==0){
                continue;
            }
            System.out.print(" "+ i);
        }*/

        /*System.out.print("Sum of Squares:");
        int sum = 0;
        for(int i = 1; i <=N; i++){
            if(i%4==0){
                continue;
            }
            sum += (i*i);
        }
        System.out.print(" " + sum);*/

        /*for (int i = 5; i>=1; i--){
            for (int j= 1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }*/

        /*for (int i = 1; i<=3; i++){
            for(int j=1; j<=4; j++)
            {
                System.out.print(j);

            }
            System.out.println();
        }*/

        for (int i = 1; i <= 5; i++) {
            // Print leading spaces
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}