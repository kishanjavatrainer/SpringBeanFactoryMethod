package com.infotech.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.ATM;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		ATM atm = ctx.getBean("atm", ATM.class);
		
		atm.printBalanceInformation("BAJ5656HA");
		
		ctx.close();
	}

}
