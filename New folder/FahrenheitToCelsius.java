import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number"); 

        double fahrenheit = scan.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit+" Fahrenheit is equal to "+celsius+" Celsius.");
        scan.close();
    }
}
