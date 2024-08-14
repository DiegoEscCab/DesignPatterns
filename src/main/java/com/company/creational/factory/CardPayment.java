package com.company.creational.factory;

public class CardPayment implements Payment{
@Override
    public void doPayment() {
    System.out.println("Pay with Credit Card");
    }
}
