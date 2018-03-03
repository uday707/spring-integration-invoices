package com.rbsfm.service;

import com.rbsfm.banking.Payment;
import com.rbsfm.exception.PaymentException;

public interface BankingService {
	
	public void pay(Payment payment) throws PaymentException;	

}
