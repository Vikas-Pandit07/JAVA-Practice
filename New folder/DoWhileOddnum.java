import java.util.Scanner;

public class DoWhileOddnum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int i = 1;
       
        do {
            if (i % 2 != 0){
                System.out.println(i);
            }
            i++;
        } while (i <= N);

        scan.close();
    }
}
