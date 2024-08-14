package com.company.creational.factory;

public class GPay implements  Payment{
    @Override
    public void doPayment() {
        System.out.println("Payment with GPay");
    }
}
