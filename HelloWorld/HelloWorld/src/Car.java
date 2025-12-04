/**
 * 
 * Creates a car that is able to print out its descriptions.
 * 
 * @author Simphiwe
 * 
 */

public class Car 
{ 			// Begin scope
	
	

	// Initialization block.	
	{
		color = "Orange"; // This line will be executed before the in-line initialization of the instance variable color.
	}
	
	
	int serialNumber;
	
	
	/**
	 * Used to generate a unique number for the serialNumber.
	 */
	static int carCount; 
	
	
	/**
	 * The color of the car.
	 */
	// Instance variables
	String color = "Red";
	String type; 
	
	
	// Initialization block. 	
	{
		color = "Green"; // This line will be executed after the in-line initialization of the instance variable color.
		
		// DISCLAMER: If this block is before the declaration of the instance variable then color will be "Green" and then "Red".
		
	}
	
	// Static initialization block. Gets executed once rather than every time an object is created. 	
	static {
		setCarCount(2); // See can only access static data
	}
	

	/**
	 * Create a string that is the description of the car.
	 * @return the generated string.
	 */
	String getDescription() 
	{
		String desc = "This is a " + color + " " + type; // local variable
		return desc;
	}

	// Customize Frame: newColor = blue     newType = convertible
	void customize(String color, String type) 
	{
		this.color = color;
		this.type = type + " " + this.type;
		System.out.println(getDescription());
	}
	
	public static void setCarCount(int c) {
		carCount = c;
	}
	 
	/**
	 * This builds a blue sedan.
	 */
	Car() {
		carCount++;
		color = "Blue"; // Finally, color will be blue.	
	}
	
	
	Car(String color) {
		
	}
	
	/**
	 * This creates a custom car
	 * @param c Color
	 * @param t Type
	 */
	
	Car(String c, String t) {
		this();
//		this("Black"); error 
		color = c;
		type = t;
		serialNumber = carCount;
	}
	
	
	void start() {
		System.out.println("Get started!");
	}
	
	void printDescription() {
		System.out.println("This is a" + color + " " + type);
	}

	static void resetCarCount() {
		carCount = 0;
	}
	
	
	static public void main(String args[]) {
		Car myCar = new Car();
		myCar.printDescription();
	}
} 		// End scope
