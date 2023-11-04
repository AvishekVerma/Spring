package com.avishek.main;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.avishek.comp.WishMessageGenerator;

public class TestApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("com/avishek/cfg/applicationContext.xml");
		
		System.out.println("\nBean count is :: "+ factory.getBeanDefinitionCount());
		System.out.println("Bean Id is :: " + Arrays.toString(factory.getBeanDefinitionNames())+"\n");
		
		WishMessageGenerator wmg = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg);
		
		factory.close();
	}

}
