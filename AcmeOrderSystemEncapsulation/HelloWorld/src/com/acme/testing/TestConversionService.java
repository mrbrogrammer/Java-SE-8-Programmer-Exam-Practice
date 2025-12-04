package com.acme.testing;

import com.acme.utils.ConversionService;
import java.math.*;

public class TestConversionService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(ConversionService.fluidOunces(1.1f));
		System.out.println(ConversionService.gallons(2.2f));
		System.out.println(ConversionService.grams(30));
		System.out.println(ConversionService.milliliters(40));
		System.out.println(ConversionService.ounces(50));
		System.out.println(ConversionService.pints(6.6f));
		System.out.println(ConversionService.pounds(7.7));

		// can you figure out why these do not compile
		// Cannot do a downcast, double to float, implicitly - double to float (added "f"/"F" to specify float, no cast required).
		ConversionService.fluidOunces(1.1f);
		// Cannot do a downcast, long to int, implicitly.
		ConversionService.grams((int) 30L);
		// Need an explicit cast to go from double to int.
		ConversionService.milliliters((int) 4.0);
		// Cannot downcast return int to a short implicitly.
		short grams = (short) ConversionService.grams(30);
		// Cannot downcast return int to a byte implicitly.
		byte byteGrams = (byte) ConversionService.grams(30);
		
		System.out.println("grams: " + grams);
		System.out.println("byteGrams: " + byteGrams);

		// why do these still work even though the types are different
		System.out.println("------------------------------------");
		// upcast from returning float to double is implicit.
		double ounces = ConversionService.fluidOunces(1.1f);
		System.out.println(ounces);
		// upcast from returning int to long is implicit.
		long milliliters = ConversionService.milliliters(40);
		System.out.println(milliliters);
		// upcast from returning int to double is implicit.
		double decimalmilliliters = ConversionService.milliliters(40);
		System.out.println(decimalmilliliters);
		// upcast from short to int is implicit.
		short s = 30;
		System.out.println(ConversionService.grams(s));
		// upcast from byte to int is implicit.
		byte b = 4;
		System.out.println(ConversionService.milliliters(b));
		// cast from char to int is implicit.
		char z = 'z';
		System.out.println(ConversionService.milliliters(z));
		// cast from int to float is allowed and is implicit (but may lose precision).
		System.out.println(ConversionService.gallons(200));
		// upcast from float to double is implicit.
		System.out.println(ConversionService.ounces(50.5f));
		// cast from long to float is allowed and is implicit (but may lose precision).
		System.out.println(ConversionService.pints(6L));
		// cast from long to double is allowed and is implicit (but may lose precision).
		System.out.println(ConversionService.pounds(7L));

		// compare these results.  Can you tell why they are different?
		System.out.println("------------------------------------");
		float bigGallons = ConversionService.gallons(123456789123456789L);
		System.out.println(bigGallons);
		// precision is lost due to working large numbers and float type.
		double bigGallons2 = 123456789123456789L * 0.2642;
		System.out.println(bigGallons2);
		// precision is retained due to working with doubles and large numbers.

		System.out.println("------------------------------------");
		int bigGrams = ConversionService.grams(1234567890);
		System.out.println(bigGrams);
		// precision is lost due to multiplying 2 ints.
		long bigGrams2 = 1234567890L * 1000L;
		System.out.println(bigGrams2);
		// precision is maintained using longs.
		
		System.out.println("------------------------------------");
		double bigPounds = ConversionService.pounds(1234567.890);
		System.out.println(bigPounds);
		BigDecimal bigPounds2 = new BigDecimal(1234567.890).multiply(new BigDecimal(2.2046));
		System.out.println(bigPounds2);
	}

}
