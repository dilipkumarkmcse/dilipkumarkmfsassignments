package corejava;
class vehicle1{
	void drive() {
		System.out.println("Driving");
	}
}
class Car extends vehicle1{
	void drive() {
		System.out.println("Repairing a car");
	}
}
public class Vehicle {
	public static void main(String[] args) {
		Car c = new Car();
		c.drive();
	}
}