package com.oca.polymorphism;

public class InventoryManager {
	
	private Automobile featuredAuto;
	
	// FRAME
	// Automobile a = new Car()
	
	public void addFeaturedAuto(Automobile a) 
	{
		featuredAuto = a;
	}
	
	public void addAutomobile(Automobile a) 
	{
		System.out.println("Adding Automobile #" + a.getVIN());
	}

}
