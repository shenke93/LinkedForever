package com.uvsq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args) 
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TestAction testAction = (TestAction) ac.getBean("testAction");
		
		testAction.runTest1();
	}
}