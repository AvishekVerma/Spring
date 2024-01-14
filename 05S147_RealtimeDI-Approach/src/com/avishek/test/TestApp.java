package com.avishek.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.avishek.comp.Flipkart;

public class TestApp {

	public static void main(String[] args) throws Exception {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/avishek/cfg/applicationContext.xml");
		System.out.println("**** Container Started ******");
		
//		System.in.read();
		
		Flipkart flipkart = factory.getBean("fpkt", Flipkart.class);
		System.out.println("TestApp flipkart obj---> " + flipkart);
		System.out.println();
		
		String result = flipkart.doShopping(new String[] {"fossinl","tissot"}, new float[] {234.5f, 4546.2f});
		System.out.println("TestApp result obj--->" +result);
		
		System.out.println("\n ****** Container stopped *****");
		
		
	}

}
