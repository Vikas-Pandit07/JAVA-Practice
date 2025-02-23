package com.kodnest.oops.Interface.RbiPolicy;

class ICICI implements RBI{
    @Override
    public void withdraw() {
        System.out.println("Withdraw from ICICI");
    }

    @Override
    public void deposit() {
        System.out.println("Deposit to ICICI");
    }

    @Override
    public void checkBalance() {
        System.out.println("Check Balance of ICICI Account");
    }

    @Override
    public void miniStatement() {
        System.out.println("Download the Mini Statement of ICICI user");
    }
}
