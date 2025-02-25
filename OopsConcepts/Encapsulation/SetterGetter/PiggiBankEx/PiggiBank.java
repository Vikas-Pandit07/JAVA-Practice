package OopsConcepts.Encapsulation.SetterGetter.PiggiBankEx;

public class PiggiBank {
    private double money;

    public void addMoney(double amount) {
        if (amount > 0) {
            money += amount;
        }
        else {
            System.out.println("Nice try! Can't add negative money");
        }
    }

    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= money) {
            money -= amount;
        }
        else {
            System.out.println("Sorry, not enough fund/ivalid amount");
        }
    }

    public double checkBalance() {
        return money;
    }
}
