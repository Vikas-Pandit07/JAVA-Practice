import java.util.Scanner;
public class VowelOrConso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        char ch = scan.next().charAt(0);
 
        
        String result = (ch =='a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U') ? "Vowel" : "Consonant";
        System.out.println(result);
        scan.close();
    }
}