package com.rbsfm.invoices;
import java.util.Collection;
/**
 * 
 * @author uday
 * Defines a contract that separates the client with the Integration Layer Provider.
 */
public interface InvoiceCollectorGateway {
	public void collectInvoices(Collection<Invoice> invoices);

}
