package com.company.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

    public static class CardType{
        public static final String VISA = "visa";
        public static final String AMEX = "amex";
    }

    private static Map<String, PrototypeCard> prototypeCardMap = new HashMap<>();

    public static  PrototypeCard getInstance(final String type) throws CloneNotSupportedException{
        return prototypeCardMap.get(type).clone();
    }

    public static void loadCard(){
        Visa visa = new Visa();
        visa.setName("This card is Visa with number 4242");
        prototypeCardMap.put(CardType.VISA, visa);

        Amex amex = new Amex();
        amex.setName("This card is Amex with number 5252");
        prototypeCardMap.put(CardType.AMEX, amex);
    }
}
