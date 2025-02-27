import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Marks");

        int marks = scan.nextInt();
        switch(marks){
            case 10: System.out.println("Excellent");
            break;

            case 9: System.out.println("Good");
            break;

            case 5: System.out.println("Average");
            break;

            default: System.out.println("Fail");
            scan.close();
        }
    }
}
