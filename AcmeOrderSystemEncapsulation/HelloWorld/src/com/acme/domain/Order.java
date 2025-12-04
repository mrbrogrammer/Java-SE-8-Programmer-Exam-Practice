package com.acme.domain;
import com.acme.utils.MyDate;

public class Order {
	private MyDate orderDate;
	private double orderAmount = 0.00;
	private String customer;
	private String product;
	private int quantity;
	
	public static double taxRate;
	
	static {
		taxRate = 0.05;
	}
	
	public Order(MyDate d, double amt, String c, String p, int q){
		orderDate=d;
		orderAmount=amt;
		customer=c;
		product=p;
		quantity=q;
	}
	
	private boolean isPositiveNumber(int number) {
		if (number < 0 || number == 0) { 
			System.out.println("Attempting to set the quantity to a value less than or equal to zero!");
			return false;
		}
		return true;
	}
	
	public Order(MyDate d, double amt, String c){
		this(d, amt, c, "anvil", 10);
	}
	
	public static void setTaxRate(double taxRate) {
		Order.taxRate = taxRate; // Use the key word .this to refer to an object 
	}
	
	public static void computeTaxOn(double anAmount) {
		System.out.println("The tax for " + anAmount + " is: " + anAmount / 1 * Order.taxRate);
	}
	
	public double computeTax() {
		System.out.println("The tax for this order is: " + orderAmount * Order.taxRate);
		return orderAmount * Order.taxRate;
	}
	
	public String toString(){
		return quantity + " ea. " + product + " for " + customer; 
	}

	public MyDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(MyDate orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		if (isPositiveNumber((int) orderAmount))
			this.orderAmount = orderAmount;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static double getTaxRate() {
		return taxRate;
	}
	
}
