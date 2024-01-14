package com.avishek.comp;

public class BlueDart implements Courier {

	static {
		System.out.println("BlueDart.class file is loading...");
	}
	
	public BlueDart() {
		System.out.println("BlueDart :: Zero param constructor...");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart.delever()");
		return "BlueDart Courier will deliver with order id :: "+oid+"for the ordered products";
	}

}
