package com.kodnest.oops.Interface.RbiPolicy;

public interface RBI {
    public void withdraw();
    public void deposit();
    public void checkBalance();
    public void miniStatement();

    default void denomination() {
        System.out.println("500 RS are not int Existance from now");
    }
    static void denomination1() {
        System.out.println("1000 RS are not int Existance from now");
    }
    private void denomination2() {
        System.out.println("Fron now 2000 Rs currency also not in existance.");
    }
}
