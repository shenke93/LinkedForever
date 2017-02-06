package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args) 
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TestAction test = (TestAction) ac.getBean("testAction");	

		test.addCityTest();
//		test.listCityTest();
//		test.addUniversityTest();
//		test.listUniversityTest();
		test.addStudentTest();
//		test.addCountryTest();
//		test.listCountryTest();
//		test.addProvinceTest();
//		test.listProvinceTest();
	}
}