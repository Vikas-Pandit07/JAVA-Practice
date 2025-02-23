package com.kodnest.oops.Interface;

public class CalculatorApp {
    public static void main(String[] args) {
        Calci calci = new Calci();
       calci.acceptCalci(new EpsunCalculator());
        calci.acceptCalci(new CasioCalculator());
        calci.acceptCalci(new CitizenCalcuator());
    }
}
