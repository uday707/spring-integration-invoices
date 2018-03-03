package com.rbsfm.service;

import com.rbsfm.banking.Payment;
import com.rbsfm.exception.PaymentException;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class MockBankingService implements BankingService {

	private final Random random = new Random();
	
	public void pay(Payment payment) throws PaymentException {

		if(random.nextDouble() > 0.9)
			throw new PaymentException("Banking Service is currently Down!"
					+ " Please try again later");
		System.out.println("Processing Payment : "+payment);

	}
}
