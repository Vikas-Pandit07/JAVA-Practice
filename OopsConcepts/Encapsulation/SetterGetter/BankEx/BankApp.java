package OopsConcepts.Encapsulation.SetterGetter.BankEx;

public class BankApp {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(1000, "123456");
        System.out.println("Initial balance: $" + bank.getBalance());

        bank.deposit(500);
        System.out.println("After Deposit: $" + bank.getBalance());

        bank.withdraw(200);
        System.out.println("After withdrawal: $" + bank.getBalance());

        bank.withdraw(2000);

        System.out.println("Final balance: $" + bank.getBalance());
        System.out.println("Account number: " + bank.getAccountNumber());
    }
}
