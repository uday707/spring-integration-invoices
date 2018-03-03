package com.rbsfm.invoices;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

@Component
public class InvoicesJob {
	
	private int limit = 10;
	
	@Autowired
	InvoiceCollectorGateway invoiceCollector;
	
	@Autowired
	InvoiceGenerator invoiceGenerator;
	
	//configurable from Injector
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	@Scheduled(fixedRate = 4000)
	public void scheduleInvoiceHandling()  {
		Collection<Invoice> invoices = generateInvoices(limit);
		System.out.println("\n=============> Sending " +invoices.size() +
				           " to the System for processing.");
		invoiceCollector.collectInvoices(invoices);
	}
	
	private Collection<Invoice> generateInvoices(int limit) {
		List<Invoice> invoices = new ArrayList<Invoice>();
		for(int i=0;i<limit;i++)
			invoices.add(invoiceGenerator.nextInvoice());
		return invoices;
	}

}
