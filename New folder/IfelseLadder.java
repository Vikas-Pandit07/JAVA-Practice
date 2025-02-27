import java.util.Scanner;
public class IfelseLadder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter YOur Marks");
        int marks=scan.nextInt();
        if(marks>=85)
        {
            System.out.println("Disctantain");
        }
        else if(marks>=75 && marks<85)
        {
            System.out.println("Excellent");
        }
        else if(marks>=65 && marks<75)
        {
            System.out.println("good");
        }
        else if(marks>=35 && marks<65)
        {
            System.out.println("AVerage");
        }
        else{
            System.out.println("Fail");
        }
        scan.close();
     }
}
