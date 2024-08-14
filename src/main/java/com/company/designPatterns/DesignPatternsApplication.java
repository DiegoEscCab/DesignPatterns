package com.company.designPatterns;

import com.company.creational.abstractfactory.AbstractFactory;
import com.company.creational.abstractfactory.Card;
import com.company.creational.abstractfactory.FactoryProvider;
import com.company.creational.abstractfactory.PaymentMethod;
import com.company.creational.factory.Payment;
import com.company.creational.factory.PaymentFactory;
import com.company.creational.factory.TypePayment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		//testFactoryMethod();
		testAbstractFactoryMethod();
	}

	private static void testFactoryMethod(){
		Payment payment = PaymentFactory.buildPayment(TypePayment.GPAY);
		payment.doPayment();
	}

	private static void  testAbstractFactoryMethod(){
		AbstractFactory abstractFactory = FactoryProvider.getFactory("CARD");
		Card card = (Card) abstractFactory.create("VISA");

		AbstractFactory abstractFactory1 = FactoryProvider.getFactory("PaymentMethod");
		PaymentMethod paymentMethod = (PaymentMethod) abstractFactory1.create("DEBIT");


		System.out.println("Type of card: " + card.getCardType() + ". Method payment: " + paymentMethod.doPayment());
	}

}
