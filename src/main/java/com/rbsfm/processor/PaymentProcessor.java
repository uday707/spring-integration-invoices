package com.rbsfm.processor;
import com.rbsfm.service.BankingService;
import com.rbsfm.exception.PaymentException;
import com.rbsfm.banking.Payment;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;

@Component
public class PaymentProcessor {
	
	@Autowired
	private BankingService bankingService;
	
	@ServiceActivator
    public void processPayment(Payment payment) throws PaymentException {
    	bankingService.pay(payment);
    }
}
