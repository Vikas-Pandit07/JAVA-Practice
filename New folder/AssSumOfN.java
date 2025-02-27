import java.util.Scanner;
public class AssSumOfN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int N = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++)
        {
            sum += i;
        }
        System.out.println(sum);
        scan.close();
    }
    
}
