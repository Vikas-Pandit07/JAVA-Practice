import java.util.Scanner;

public class OnetoN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int N = scan.nextInt( );

        for (int i = 1; i <= N; i++)
        {
            System.out.println(i);
        }
        scan.close();
    }
}
