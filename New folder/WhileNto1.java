import java.util.Scanner;

public class WhileNto1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int i = num;

        while (i >= 1) {
            System.out.println(i);
            i--;
        }
        scan.close();
    }

}
