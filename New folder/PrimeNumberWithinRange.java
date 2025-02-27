import java.util.Scanner;
public class PrimeNumberWithinRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");

        int start = scan.nextInt();  
        int end = scan.nextInt();  
        
        System.out.println("Prime numbers between "+start+" and "+end+" are: ");
        
    //     for (int i = start; i <= end; i++) {
    //         if (isPrime(i)) {
    //             System.out.println(i);
    //         }
    //     }
    //     scan.close();
    // }     

    // public static boolean isPrime(int number) {
    //     if (number <= 1) {
    //         return false;
    //     }

    //     for (int i = 2; i <= number / 2; i++) {
    //         if (number % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;

        
    for (int i = start; i <= end; i++) 
    {
        int res = isPrime(i);
        if (res == 10) {
            System.out.println(i);
        }
    }
    scan.close();
}     

static int isPrime(int number) {
    if (number <= 1) {
        return -1;
    }

    for (int i = 2; i <= number / 2; i++) {
        if (number % i == 0) {
            return -1;
        }
    }
    return 10;
    }
}
