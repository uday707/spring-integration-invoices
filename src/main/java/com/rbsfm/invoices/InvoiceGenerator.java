package com.rbsfm.invoices;

import java.util.Random;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;
import com.rbsfm.invoices.Invoice;

@Component
public class InvoiceGenerator {

	private Random random = new Random();
    public Invoice nextInvoice() {
    	return new Invoice(random.nextBoolean()? iban() : null,
    			           address(), account(), dollers());
    }
    
    public String address() {
    	return "Test Street "+ random.nextInt(100) +1;
    }
    
    public String account() {
    	return "test-account "+random.nextInt(1000) + 1000;
    }
    public BigDecimal dollers() {
    	return new BigDecimal(1+random.nextInt(20000));
    }
    public String iban() {
    	return "test-iban-"+random.nextInt(1000)+1000;
    }
}
