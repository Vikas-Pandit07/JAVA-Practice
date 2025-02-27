import java.util.Scanner;
public class SeasonPredictor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your month");

        int month = scan.nextInt();

        String seasons;

        switch (month) {
            case 12: case 1: case 2:
                seasons = "Winter";
                break;
            
            case 3: case 4: case 5:
                seasons = "Spring";
                break;

            case 6: case 7: case 8:
                seasons = "Summer"; 
                break;

            case 9: case 10: case 11:
                seasons = "Winter";         
                break;
            default:
                seasons = "Not a season";
                break;
        }
        System.out.println(month+ " number moth has a "+""+seasons+"");

        scan.close();
    }
}