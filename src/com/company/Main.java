package com.company;

import com.company.creational.factoryMethod.Payment;
import com.company.creational.factoryMethod.PaymentFactory;
import com.company.creational.factoryMethod.TypePayment;

public class Main {
    public static void main(String[] args) {
        testFactoryMethod();
    }

    private static void testFactoryMethod(){
        Payment payment = PaymentFactory.buildPayment(TypePayment.GPAY);
        payment.doPayment();
    }

}