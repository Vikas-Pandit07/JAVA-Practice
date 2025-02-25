package OopsConcepts.Encapsulation.SetterGetter.BankEx;

public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(double initialBalance, String accountNumber) {
        this.accountNumber = accountNumber;
        if(initialBalance > 0) {
            this.balance = initialBalance;
        }
        else {
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
        else  {
            System.out.println("Invalid Deposit");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
        else {
            System.out.println("Insufficient funds/ invalid withdraw");
        }
    }

    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
}
