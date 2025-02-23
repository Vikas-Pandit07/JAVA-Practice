package com.kodnest.oops.Interface.RbiPolicy;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.acceptBank(new SBI());
        bank.acceptBank(new HDFC());
        bank.acceptBank(new ICICI());
        bank.acceptBank(new Axis());
        RBI.denomination1();

    }
}
