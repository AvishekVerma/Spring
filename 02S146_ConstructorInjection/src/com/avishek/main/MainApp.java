package com.avishek.main;

import java.util.Date;

import com.avishek.comp.WishMessageGenerator;

public class MainApp {

	public static void main(String [] args) {
		
		Date date = new Date();
		WishMessageGenerator generator = new WishMessageGenerator(date);
		System.out.println("Targer Object Before Setter Injection is :: " + generator);
		
		
		System.out.println("Dependent Object is :: "+ date);
		
		System.out.println("Target Object after Setter Injection :: " + generator);
		
		System.out.println();
		
		String result = generator.generateMessage("Avishek");
		System.out.println(result);
		
	}
}
