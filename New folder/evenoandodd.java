import java.util.Scanner;
public class evenoandodd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println("The first "+n+ " even numbers are:");
        for (int i = 1; i <= n * 2; i++){
            if(i % 2 == 0)
            System.out.println(i);
        }
        scan.close();
    }
}
