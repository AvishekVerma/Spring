package com.avishek.comp;

import java.util.Date;

//Target class(User Defined)
public class WishMessageGenerator {

	// Dependent class(preDefined)
	private Date date;
	
	static {
		System.out.println("WishMessageGenerator.class file is loading...");
	}
	
	public WishMessageGenerator(Date date) {
		this.date = date;
		System.out.println("WishMessageGenerator :: One Param Constructor...");
	}
	
	// Business logic method ==> Using dependent object in B.L.
	public String generateMessage(String userName) {
		@SuppressWarnings("deprecation")
		int hour = date.getHours();//get hour in 24 hours format
		
		if(hour<12) {
			return "Good Morning :: "+ userName;
		}else if(hour < 16) {
			return "Good AfterNoon :: "+ userName;
		}else if(hour < 20) {
			return "Good Evening :: " + userName;
		}else {
			return "Good Night :: " + userName;
		}
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}

}
