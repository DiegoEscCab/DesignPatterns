package com.company.creational.abstractfactory;

public class Debit implements PaymentMethod{
    @Override
    public String doPayment() {
        return "Debit card payment";
    }
}
