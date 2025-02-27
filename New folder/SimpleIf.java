import java.util.Scanner;

public class SimpleIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = scan.nextInt();
        if(age>=18)
            System.out.println("Eligible for voting");
        
        scan.close();
    }
}
