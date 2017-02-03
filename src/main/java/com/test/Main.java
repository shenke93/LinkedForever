package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main
{
	public static void main(String[] args) 
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		ProvinceService service = (ProvinceService) ac.getBean("provinceService");
		TestAction test = (TestAction) ac.getBean("testAction");	

		test.addCountryTest();
		test.listCountryTest();
		test.addProvinceTest();
//		test.listProvinceTest();
	}
}