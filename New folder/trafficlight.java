import java.util.Scanner;
public class trafficlight{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a light");
        char light = scan.next().charAt(0);
        performAction(light);
        scan.close();
    }
    public static void performAction(char light){
     switch (light) {
            case 'R':
                System.out.println("Stop");
                break;
            case 'Y':
            System.out.println("Wait");
            break;
            case 'G':
            System.out.println("Go");
            break;
            default:
            System.out.println("No a traffic color");

        }
    }
}
