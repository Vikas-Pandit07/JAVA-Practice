public class TernaryLargeNum{
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 10;

        int larger = (num1>num2) ? num1 : num2;
        System.out.println("Larger number between " + num1 + " and " + num2 + " is: " + larger);
    }
}