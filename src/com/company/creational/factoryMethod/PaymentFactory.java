package com.company.creational.factoryMethod;

public class PaymentFactory {

    public static Payment buildPayment(TypePayment typePayment){
        switch (typePayment){
            case CARD -> {
                return new CardPayment();
            }
            case GPAY -> {
                return new GooglePay();
            }
            default -> {
                return new CardPayment();
            }
        }
    }
}
