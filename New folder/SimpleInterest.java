import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      int p = scan.nextInt();
      int r = scan.nextInt();
      int t = scan.nextInt();

      double si = (p * r * t) / 100;
      System.out.println(si);
        
      scan.close();
}
}