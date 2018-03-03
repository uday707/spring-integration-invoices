package com.rbsfm.banking;
import java.math.BigDecimal;

public class Payment {
	private final String senderAccount;
	private final String recieverAccount;
	private final BigDecimal dollers;

	public Payment(String senderAccount, String recieverAccount,
			       BigDecimal dollers) {
		this.senderAccount = senderAccount;
		this.recieverAccount = recieverAccount;
		this.dollers = dollers;
	}

	public String getSenderAccount() {
		return senderAccount;
	}
	public String getRecieverAccount() {
		return recieverAccount;
	}
	public BigDecimal getDollers() {
		return dollers;
	}
	
	public String toString() {
		return "Payment : [ SenderAccount = "+senderAccount+
				" | RecieverAccount = "+recieverAccount+
				" | Dollers = "+dollers+" ]";
	}
}
