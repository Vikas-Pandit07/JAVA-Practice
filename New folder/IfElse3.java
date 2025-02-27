import java.util.Scanner;

public class IfElse3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Age21");
        int age = scan.nextInt();
        boolean res = check(age);
        if(res)
        {
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not eligible");
        }
        scan.close();
    }
    public static boolean check(int age){
        if(age>=18){
        return true;
        }
        else{
        return false;
        }
        
    }
}
