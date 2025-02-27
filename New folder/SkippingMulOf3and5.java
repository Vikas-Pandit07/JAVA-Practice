import java.util.Scanner;

public class SkippingMulOf3and5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int N = scan.nextInt();
        System.out.print("Numbers:");
        for (int i = 1; i <= N; i++)
        {
          if(i % 3 == 0 && i % 5 == 0)
          {
            continue;
          }  
          System.out.print(" " + i);
        }
        scan.close();
    }
}
