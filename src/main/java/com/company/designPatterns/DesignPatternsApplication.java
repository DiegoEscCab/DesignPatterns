package com.company.designPatterns;

import com.company.creational.factory.Payment;
import com.company.creational.factory.PaymentFactory;
import com.company.creational.factory.TypePayment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		testFactoryMethod();
	}

	private static void testFactoryMethod(){
		Payment payment = PaymentFactory.buildPayment(TypePayment.GPAY);
		payment.doPayment();
	}

}
