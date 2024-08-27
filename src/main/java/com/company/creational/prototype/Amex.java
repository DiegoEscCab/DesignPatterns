package com.company.creational.prototype;

public class Amex implements PrototypeCard{
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getCard() {
        System.out.println("This is a Amex card payment");
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Cloning Amex card payment");
        return (Amex) super.clone();
    }
}
