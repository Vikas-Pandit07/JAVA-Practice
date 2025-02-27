import java.util.Scanner;
public class EvenOdd1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scan.nextInt();
        boolean check = EvenOdd(num);
        if(check==true){
            System.out.println("Even");
        }
        else
        {
            System.out.println("odd");
        }
        scan.close();
    }
    public static boolean EvenOdd(int num){
        if(num%2==0)
        {
            return true;
        }
        else
        return false;
    }
}