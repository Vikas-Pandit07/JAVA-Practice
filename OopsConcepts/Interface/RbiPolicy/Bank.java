package com.kodnest.oops.Interface.RbiPolicy;

public class Bank {
    void acceptBank(RBI ref) {
        ref.withdraw();
        ref.deposit();
        ref.checkBalance();
        ref.miniStatement();
    }
}

