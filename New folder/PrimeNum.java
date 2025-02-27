import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = scanner.nextInt();

        for (int x = 1; true; x++){
            int num = x;
            int fact = 0;

            for (int i = 1; i <= num; i++) {
                if(num % i == 0) {
                    fact++;
                }
            }
            if (fact == 2) {
                System.out.println(num);
                n--;
            }
            if (n == 0){
                break;
            }
        }
    }
}
