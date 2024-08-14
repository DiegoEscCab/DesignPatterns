package com.company.creational.abstractfactory;

public class Mastercard implements Card{
    @Override
    public String getCardType() {
        return "Mastercard";
    }

    @Override
    public String getCardNumber() {
        return "4242 4242 4242 4242";
    }

    @Override
    public String getExpireMonth() {
        return "01";
    }

    @Override
    public String getExpireYear() {
        return "24";
    }
}
