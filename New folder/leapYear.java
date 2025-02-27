import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year");
        int year1 = scan.nextInt();

        boolean leapYear = false;

        if (year1 % 4 == 0) {
            if (year1 % 100 != 0 || year1 % 400 == 0) {
                leapYear = true;
            }
        }

        if(leapYear) {
            System.out.println(year1+" is a leap year.");
        }
        else {
            System.out.println(year1 + " is not a leap year");
        }
        scan.close();
    }
}