package com.kodnest.oops.Interface.RbiPolicy;

public class SBI implements RBI{

    @Override
    public void withdraw() {
        System.out.println("Withdraw from SBI");
    }

    @Override
    public void deposit() {
        System.out.println("Deposit to SBI");
    }

    @Override
    public void checkBalance() {
        System.out.println("Check Balance of SBI Account");
    }

    @Override
    public void miniStatement() {
        System.out.println("Download the Mini Statement of SBI user");
    }
}
