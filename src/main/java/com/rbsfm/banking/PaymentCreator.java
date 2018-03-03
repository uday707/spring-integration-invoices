package com.rbsfm.banking;

import com.rbsfm.exception.PaymentException;
import com.rbsfm.invoices.Invoice;

public interface PaymentCreator {
	
	//this interface creates the payment from the account for 
	//the invoice submitted to the system
	Payment createPayment(Invoice invoice) throws PaymentException;

}
