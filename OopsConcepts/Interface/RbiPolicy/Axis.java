package com.kodnest.oops.Interface.RbiPolicy;

public class Axis implements RBI{
    @Override
    public void withdraw() {
        System.out.println("Withdraw from AXIS");
    }

    @Override
    public void deposit() {
        System.out.println("Deposit to AXIS");
    }

    @Override
    public void checkBalance() {
        System.out.println("Check Balance of AXIS Account");
    }

    @Override
    public void miniStatement() {
        System.out.println("Download the Mini Statement of AXIS user");
    }
}
