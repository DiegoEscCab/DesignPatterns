package com.company.creational.factory;

public class PaymentFactory {

    public static Payment buildPayment(TypePayment typePayment){
        switch (typePayment) {
            case GPAY:
                return new GPay();
            case CARD:
                return new CardPayment();
            default:
                return new CardPayment();
        }
    }
}
