package com.avishek.main;

import java.util.Date;

import com.avishek.comp.WishMessageGenerator;

public class UsingCoreJavaApp {

	public static void main(String[] args) {
		WishMessageGenerator generator = new WishMessageGenerator();
		System.out.println("Target object Before setter injection is :: " + generator);

		Date date = new Date();
		System.out.println("Dependent object is :: " + date);

		generator.setDate(date);
		System.out.println("Target object after setter Injection :: " + generator);

		String result = generator.generateMessage("Avishek");
		System.out.println(result);
	}

}
