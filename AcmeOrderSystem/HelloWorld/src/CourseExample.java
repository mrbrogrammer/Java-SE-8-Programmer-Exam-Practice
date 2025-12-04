
public class CourseExample {
	
	static Car myCar;
	
	static void doSomething(Car car) {
		myCar = car; // the object pass in will be referenced by myCar forever. But the car will be eligible for gc as soon as it is dereferenced 
		System.out.println("The color of car is: " + car.color);
		myCar = null; // we clean up like this
	}
}
