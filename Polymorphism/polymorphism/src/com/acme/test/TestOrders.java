package com.acme.test;
import com.acme.domain.Liquid;
import com.acme.domain.Order;
import com.acme.domain.Solid;
import com.acme.domain.Good.UnitOfMeasureType;
import com.acme.utils.MyDate;

public class TestOrders {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		MyDate date1 = new MyDate(1,20,2008);
		Solid acmeAnvil = new Solid("Acme Anvil", 1668, 0.3, UnitOfMeasureType.CUBIC_METER, false, 5000, 0.5, 0.5);
		Order anvil = new Order(date1, 2000.00, "Wile E Coyote", acmeAnvil, 10);

		MyDate date2 = new MyDate(4,10,2008);
		Solid ballon = new Solid("Acme Ballon", 1401, 0.65, UnitOfMeasureType.CUBIC_FEET, false, 10, 5, 5);
		Order balloons = new Order(date2, 1000.00, "Bugs Bunny", ballon, 125);

		MyDate date3 = new MyDate(4,10,2008);
		Liquid fiji = new Liquid("Acme Fiji", 1401, 0.65, UnitOfMeasureType.GALLON, true, 10, 5);
		Order water = new Order(date3, 1000.00, "Fiji Water", fiji, 125);
		
		// Test getters and setters
		balloons.setOrderAmount(-10.0);

		System.out.println(anvil);
		System.out.println(balloons);
		
		// How many Order objects are created in the main method of TestOrders? 2
		
		System.out.println();
		
		System.out.println("The tax rate is currently: " + Order.taxRate);
		Order.computeTaxOn(3000.00);
		anvil.computeTax();
		balloons.computeTax();
		
		System.out.println();
		
		Order.setTaxRate(0.06);
		System.out.println("The tax rate is currently: " + Order.taxRate);
		Order.computeTaxOn(3000.00);
		anvil.computeTax();
		balloons.computeTax();
		
		System.out.println();
		
		MyDate date4 = new MyDate(5, 20, 2008);
		Order anotherAnvil = new Order(date4, 200, "Road Runner");
		System.out.println(anotherAnvil);

		// Test MyDate equals
		if (date1.equals(date2)) {
			System.out.println("These two dates are equal.");
		} else {
			System.out.println("These two dates are not equal.");
		}
		
		
		/**
		 * Although Polymorphism is a powerful mechanism that makes code more flexible, it
		 * can be a bit of a double-edged sword when trying to deal with the more specific
		 * properties or capabilities of an object through its generic reference
		 */
		
		System.out.println("The volume of the anvil is: " + anvil.getProduct().volume());
		System.out.println("The length of the anvil is: " + ((Solid) anvil.getProduct()).getLength());
		
		// if the product was really a Liquid and not a Solid
		System.out.println("The length of the anvil is: " + ((Solid) water.getProduct()).getLength());
	}

}
