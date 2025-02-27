public class MaximumOfThree {
    public static void main(String[] args) {
        int num1  = 5; int num2 = 9; int num3 = 3;

        int max = num1;
        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }
        System.out.println(max);
    }
}