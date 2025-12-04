package com.acme.utils;

public class MyDate {

	private byte day;
	private byte month;
	private int year;

	public MyDate() {

	}

	public MyDate(int day, int month, int year) {
		this.day = (byte) day;
		this.month = (byte) month;
		this.year = year;
	}

	private boolean valid(int day, int month, int year) {
		if (day > 31 || day < 1 || month > 12 || month < 1) {
			System.out.println("Attempting to create a non-valid date " + month + "/" + day + "/" + year);
			return false;
		}
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			return (day <= 30);
		case 2:
			return day <= 28 || (day == 29 && year % 4 == 0);
		}
		return true;
	}

	/**
	 * Create accessors (a.k.a. getter) and mutator (a.k.a. setter) methods here
	 */

	public int getDay() {
		
		return day;
	}

	public void setDay(int day) {
		if (valid(day, this.month, this.year)) 
			this.day = (byte) day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (valid(this.day, month, this.year))
			this.month = (byte) month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (valid(this.day, this.month, year))
			this.year = year;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o != null || o instanceof MyDate) {
			MyDate d = (MyDate) o;
			if (day == d.day && month == d.month && year == d.year) {
				return true;
			} 
		}
		return false;
	}

	@Override
	public String toString() {

		return month + "/" + day + "/" + year;
	}
}
