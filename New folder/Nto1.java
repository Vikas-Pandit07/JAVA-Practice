import java.util.Scanner;

public class Nto1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");

        int num = scan.nextInt();
        for(int i = num; i >= 1; i--){
            System.out.println(i);
        }
        scan.close();
    }
}
