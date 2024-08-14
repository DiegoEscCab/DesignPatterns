package com.company.creational.abstractfactory;

public class Credit implements PaymentMethod{
    @Override
    public String doPayment() {
        return "Credit card payment";
    }
}
