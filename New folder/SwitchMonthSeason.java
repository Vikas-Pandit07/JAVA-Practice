import java.util.Scanner;
public class SwitchMonthSeason {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your month");
        int month = scan.nextInt();
        setSeason(month);
        scan.close();
    }
    public static void setSeason(int month) {
        switch (month) {
            case 1: case 2: case 12:
                System.out.println("Winter");
                break;
        
            default:
                System.out.println("not a mention");
                break;
        }
    }
}
