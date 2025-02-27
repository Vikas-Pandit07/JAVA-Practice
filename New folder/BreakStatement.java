import java.util.Scanner;

public class BreakStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number");
        int n = scan. nextInt();

        for (int i = 1; i <= n; i++)
        {
            if (i % 5 == 0){
                break;
            }
            System.out.print(i+" ");
        }
        scan.close();
    }
}
