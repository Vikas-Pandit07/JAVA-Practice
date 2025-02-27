import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");

        int number = scan.nextInt();

    /*
         if (isPrime(number)){
             System.out.println(number+" is a prime number.");
         }
         else {
             System.out.println(number+" is not a prime number.");
         }
         scan.close();
     }
     public static boolean isPrime(int number) {
         if (number <= 1) {
             return false;
         }
         for (int i = 2; i <= number / 2; i++) {
             if (number % i == 0) {
                 return false;
             }
         }
         return true;
    */

        if (number <= 1)
    {
        System.out.println(number+" is not a prime number.");
    }
    else 
    {
        boolean isPrime = true;
        
        for (int i = 2; i <= number / 2; i++)
            if (number % i == 0) System.out.println(number + " is not a prime number.");
        if (isPrime)
            System.out.println(number + " is a prime number.");
    }
        scan.close();
   }
}
