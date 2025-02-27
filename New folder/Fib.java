import java.util.Scanner;
public class Fib {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        // int n = scan.nextInt();
        // int num1 = 0;
        // int num2 = 1;

        // if(n == 0){
        //     System.out.print(num1);
        // }
        // else if(n == 1){
        //     System.out.print(num1+" "+num2+" "+ num2);
        // }
        // else{
        //     System.out.print(num1+" "+num2+" ");
        //     int fib = 0;
        //     //while (fib < n)
        //     while(fib < n){
        //         fib = num1 + num2;
        //         if(fib < n){
        //         num1 = num2;
        //         num2 = fib; 
        //         System.out.print(fib+ " ");
        //         }
        //     }
        // }

// up to terms

    /*  int number = scan.nextInt();

        int num1 = 0;
        int num2 = 1;

        int fib = 0;
        System.out.println("Fibonacci series up to "+number+"terms");

        while (fib < number) {
            System.out.println(num1+" ");
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
            fib++;
        }*/

        //up to given number
        int number = scan.nextInt();

        int num1 = 0;
        int num2 = 1;
 
        System.out.print("Fibonacci series up to "+number+" terms: ");

        while (num1 <= number) {
            System.out.print(num1+" ");
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
        }
        scan.close();
    }
}