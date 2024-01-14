package com.avishek.comp;

public class DTDC implements Courier {

	static {
		System.out.println("DTDC.class file is loading...");
	}
	
	public DTDC() {
		System.out.println("DTDC :: Zero param constructor...");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		return "DTDC Courier will deliver with order id :: "+oid+"for the ordered products";
	}

}
