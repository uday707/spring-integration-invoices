package com.rbsfm.banking;

import com.rbsfm.exception.PaymentException;
import com.rbsfm.invoices.Invoice;
import org.springframework.stereotype.Component;
import org.springframework.integration.annotation.Transformer;

@Component
public class ForeignPaymentCreator implements PaymentCreator {

	private static final String CURRENT_IBAN_ACCT = "current-iban-acct";
	@Transformer
	public Payment createPayment(Invoice invoice) throws PaymentException {
		
		if(null == invoice.getIban())
			throw new PaymentException("IBAN mustn't be null when creating the "
					+ "foreign account payment");
		return new Payment(CURRENT_IBAN_ACCT, invoice.getAccount(), invoice.getDollers());
	}

}
