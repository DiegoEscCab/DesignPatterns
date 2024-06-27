package com.company.creational.factoryMethod;

public class GooglePay implements Payment{
    @Override
    public void doPayment(){
        System.out.printf("Paying with GooglePay");
    }
}
