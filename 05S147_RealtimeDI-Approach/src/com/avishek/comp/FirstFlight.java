package com.avishek.comp;

public class FirstFlight implements Courier {

	static {
		System.out.println("FirstFlight.class file is loading...");
	}
	
	public FirstFlight() {
		System.out.println("FirstFlight :: Zero param constructor...");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("FirstFlight.delever()");
		return "FirstFlight Courier will deliver with order id :: "+oid+"for the ordered products";
	}

}
