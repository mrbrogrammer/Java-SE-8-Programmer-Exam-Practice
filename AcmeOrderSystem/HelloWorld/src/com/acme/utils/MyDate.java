package com.acme.utils;

public class MyDate {
	
	int day;
	int month;
	public int year;
	
	public MyDate() 
	{
		
	}
	
	public MyDate(int day, int month, int year) 
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public String toString() {
		
		return month + "/" + day + "/" + year;
	}

}
