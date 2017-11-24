package com.poseidon.di2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DI2Main {
	public static void main(String[] args) {
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext(configLocation);
		
		Info my = ctx.getBean("myinfo", Info.class);
		my.getInfo();
		ctx.close();
	}
}
