import java.util.Scanner;
public class Scanner1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Age");
        int age = scan.nextInt();
        System.out.println("Your Age is:"+age);

        System.out.println("Enter your Height");
        float height = scan.nextFloat();
        System.out.println("Your Age is:"+height);

        System.out.println("Are you married Yes/No");
        boolean status = scan.nextBoolean();
        System.out.println("Your are married:"+status);

        System.out.println("Enter your name");
        String name = scan.next();

        System.out.println("Your are name is:"+name);

        System.out.println("Enter your message");
        String message = scan.nextLine();
        System.out.println("Your message is:"+message);
        scan.close();
    }

}
