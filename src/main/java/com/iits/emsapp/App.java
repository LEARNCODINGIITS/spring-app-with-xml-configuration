package com.iits.emsapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		String location="applicationContext.xml";
		ApplicationContext context
		=new ClassPathXmlApplicationContext(location);
		
		Employee employee=(Employee)context.getBean("emp");// We are asking IOC to get the Bean object
		System.out.println(employee.toString());
		
		 
		

	}
}
