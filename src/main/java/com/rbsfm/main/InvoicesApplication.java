package com.rbsfm.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InvoicesApplication {

	public static void main(String[] args) {

		new ClassPathXmlApplicationContext("invoice-context.xml");

	}

}
