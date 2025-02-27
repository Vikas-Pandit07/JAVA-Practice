public class ContinueStatement {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                System.out.println("Number"+i+" is Skipped");
                continue;
            }
            sum += i;
            System.out.println("Number"+i+" is Added. Current sum is: "+sum);
        }
        System.out.println("Final sum: "+sum);
    }
}
