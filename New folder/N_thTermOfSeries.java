import java.util.Scanner;

public class N_thTermOfSeries 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = scan.nextInt();

        int nthTerm = (n * (n + 1)) / 2;
        System.out.println("The "+ n +"th term of the series is "+ nthTerm +".");
        scan.close();
    }
}
