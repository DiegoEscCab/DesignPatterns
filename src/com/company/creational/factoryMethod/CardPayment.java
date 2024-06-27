package com.company.creational.factoryMethod;

public class CardPayment implements Payment{
    @Override
    public void doPayment() {
        System.out.printf("Paying with debit card");
    }
}
