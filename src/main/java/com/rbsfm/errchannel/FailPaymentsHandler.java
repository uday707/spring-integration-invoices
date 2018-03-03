package com.rbsfm.errchannel;
import org.springframework.stereotype.Component;
import org.springframework.integration.annotation.ServiceActivator;

@Component
public class FailPaymentsHandler {

	@ServiceActivator
	public void handleFailedPayment(Exception e) {
		System.out.println("Payment Failed: "+e);
		//Now the system should do some reasonable to
		//process the failed payments to proper error channel.
	}
}
