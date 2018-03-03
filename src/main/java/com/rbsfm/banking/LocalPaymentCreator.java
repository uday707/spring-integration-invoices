package com.rbsfm.banking;

import com.rbsfm.exception.PaymentException;
import com.rbsfm.invoices.Invoice;
import org.springframework.stereotype.Component;
import org.springframework.integration.annotation.Transformer;

@Component
public class LocalPaymentCreator implements PaymentCreator {

	private static final String CURRENT_LOCAL_ACC = "current-loc-acct";
	
	@Transformer
	public Payment createPayment(Invoice invoice) throws PaymentException {
		
		if(null == invoice.getAccount())
			throw new PaymentException("Account can'nt be empty when "
					+ "creating the local payment!");
		return new Payment(CURRENT_LOCAL_ACC, invoice.getAccount(),invoice.getDollers());
	}

}
