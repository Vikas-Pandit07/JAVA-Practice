package OopsConcepts.Encapsulation.SetterGetter.PiggiBankEx;

public class Main {
    public static void main(String[] args) {
        PiggiBank piggiBank = new PiggiBank();
        piggiBank.addMoney(100.0);
        piggiBank.withdrawMoney(40);
        System.out.println("Balance: " + piggiBank.checkBalance());

        piggiBank.addMoney(-50.0);
        piggiBank.withdrawMoney(1000.0);
        System.out.println("Final Balance: " + piggiBank.checkBalance());
    }
}
