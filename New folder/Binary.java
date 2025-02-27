import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n");

        int number = scan.nextInt();
        
        int originalNum = number;
        String result = "";

        while (number != 0) {
            int rem = number % 2;
            result = rem + result;
            number /= 2;
        }
        System.out.print("Binary Equivalent of " + originalNum +" is "+result);
        scan.close();
    }
}
