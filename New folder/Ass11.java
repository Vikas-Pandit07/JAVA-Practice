import java.util.Scanner;

public class Ass11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int N = scan.nextInt();
        System.out.print("Numbers:");
        int sum = 0;
        for (int i = 1; i <= N; i++)
        {
           
          if(i % 4 == 0 )
          {
            continue;
          }  
          sum += (i * i);
          
        }
        System.out.print(" " + sum);
        scan.close();
    }
}
