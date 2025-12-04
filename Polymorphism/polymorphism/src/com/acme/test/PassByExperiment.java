package com.acme.test;

import com.acme.utils.MyDate;

public class PassByExperiment {

	public static void main(String[] args) {
		MyDate date = new MyDate(6, 20, 1999);
		
		System.out.println("Before passing an object " + date);
		
		passByObject(date);
		
		System.out.println("After passing an object " + date);
		
		System.out.println("Before passing a primitive " + date.getYear());
		
		passPrimitive(date.getYear());
		
		System.out.println("After passing a primitive " + date.getYear());
		
		System.out.println("Before passing a string " + date.toString());
		
		passString(date.toString());
		
		System.out.println("After passing a string " + date.toString());
		
		System.out.println("Before passing a stringBuilder " + date.toString());
		
		passByStringBuilder(new StringBuilder(date.toString()));
		
		System.out.println("After passing a stringBuilder " + date.toString());
	}

	static public void passByObject(MyDate d) {
		d = new MyDate(6, 20, 2025);
		d.setDay(0);
	}

	public static void passPrimitive(int i) {
		i = 2010;
	}
	
	public static void passString(String s) {
		int yearSlash = s.lastIndexOf("/");
		s = s.substring(0, yearSlash);
		s += "2012";
		System.out.println("New date string: " + s);
	}
	
	public static void passByStringBuilder(StringBuilder sb) {
		int yearSlash = sb.lastIndexOf("/");
		sb.substring(0, yearSlash);
		sb.append("2012");
		System.out.println("New date string: " + sb);
	}
}
