package com.rbsfm.invoices;

import java.math.BigDecimal;

public class Invoice {

	private final String iban;
	private final String address;
	private final String account;
	private final BigDecimal dollers;
	
	public Invoice(String iban, String address, 
			String account, BigDecimal dollers) {
		   this.iban = iban;
		   this.address = address;
		   this.account = account;
		   this.dollers = dollers;
	}
	
	public boolean isForeign() {
		return null != account && !iban.isEmpty();
	}
	
	public String getIban() {
		return iban;
	}
	
	public String getAddress() {
		return address;
	}
	public String getAccount() {
		return account;
	}
	public BigDecimal getDollers() {
		return dollers;
	}
}
