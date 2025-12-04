package com.oca.test;

import com.oca.polymorphism.*;

public class TestCarDealership {
	
	private static InventoryManager manager = new InventoryManager();
	
	public static void main(String args[])
	{
		Car c = new Car();
		manager.addAutomobile(c);
		manager.addFeaturedAuto(new Car());

		
		Truck t = new Truck();
		manager.addAutomobile(t);
		
		Motorcycle m = new Motorcycle();
		manager.addAutomobile(m);
	}
}
