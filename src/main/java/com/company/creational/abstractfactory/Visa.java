package com.company.creational.abstractfactory;

public class Visa implements Card {
    @Override
    public String getCardType() {
        return "VISA";
    }

    @Override
    public String getCardNumber() {
        return "4242 4242 4242 4242";
    }

    @Override
    public String getExpireMonth() {
        return "12";
    }

    @Override
    public String getExpireYear() {
        return "24";
    }
}
