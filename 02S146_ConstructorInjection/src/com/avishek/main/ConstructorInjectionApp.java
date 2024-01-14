 package com.avishek.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.avishek.comp.WishMessageGenerator;

@SuppressWarnings("deprecation")
public class ConstructorInjectionApp {

	public static void main(String[] args) {
		
		FileSystemResource resource = new FileSystemResource("src/com/avishek/cfg/applicationContext.xml");
		
		System.out.println("*************BeanFactory container starting**********");
		XmlBeanFactory factory = new XmlBeanFactory(resource);
//		System.out.println("Bean Factory : " + factory);
		System.out.println("************** BeanFactory container started**********\n");

		WishMessageGenerator wishMessage = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wishMessage);
		
		String result = wishMessage.generateMessage("Avisek");
		System.out.println(result);
		
		System.out.println("\n****** BeanFactory is cloing*********");
		
	
	}

}
