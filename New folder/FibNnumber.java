import java.util.Scanner;
public class FibNnumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scan.nextInt();
        int num1 = 0;
        int num2 = 1;

        if(n == 1){
            System.out.print(num1);
        }
        else if(n == 2){
            System.out.print(num1+" "+num2);
        }
        else{
            System.out.print(num1+" "+num2);
            
            for(int i = 1; i <= n - 2; i++){
                int fib = num1 + num2;
                num1 = num2;
                num2 = fib;
                System.out.print(" "+fib);
            }
        }
        scan.close();
    }
}
