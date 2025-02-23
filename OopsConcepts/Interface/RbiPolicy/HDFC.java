package com.kodnest.oops.Interface.RbiPolicy;

public class HDFC implements RBI{
    @Override
    public void withdraw() {
        System.out.println("Withdraw from HDFC");
    }

    @Override
    public void deposit() {
        System.out.println("Deposit to HDFC");
    }

    @Override
    public void checkBalance() {
        System.out.println("Check Balance of HDFC Account");
    }

    @Override
    public void miniStatement() {
        System.out.println("Download the Mini Statement of HDFC user");
    }
}
