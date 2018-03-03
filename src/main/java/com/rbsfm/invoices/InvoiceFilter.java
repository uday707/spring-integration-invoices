package com.rbsfm.invoices;
import org.springframework.stereotype.Component;
import org.springframework.integration.annotation.Filter;


@Component
public class InvoiceFilter {
	
	public static final int LOW_ENOUGH_THRESHOLD = 10000;
	
	@Filter
	public boolean accept(Invoice invoice) {
		boolean lowEnough = 
				invoice.getDollers().intValue() > LOW_ENOUGH_THRESHOLD;
		System.out.println("Amount of $ "+invoice.getDollers()+
				(lowEnough? " can" : " can'nt") +
				" be automatically processed by system");
		return lowEnough;
	}

}
