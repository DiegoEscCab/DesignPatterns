package com.company.creational.prototype;

public class Visa implements PrototypeCard{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getCard() {
        System.out.println("This a visa card payment");
    }

    @Override
    public PrototypeCard clone() throws CloneNotSupportedException {
        System.out.println("Cloning visa card payment");
        return (Visa) super.clone();
    }
}
