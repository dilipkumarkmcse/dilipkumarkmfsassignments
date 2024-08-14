package corejava;
import java.util.*;
class Shape{
	void getArea() {
		System.out.println("rectangle created");
	}
}
class rectangle2{
	void getArea() {
		Scanner d = new Scanner(System.in);
		int Length = d.nextInt();
		int Breath = d.nextInt();
		int Area = Length * Breath;
		System.out.println("Area of Rectangle : " + Area);
		d.close();
	}
}
public class rectangle1 {
	public static void main(String[] args) {
		rectangle2 r = new rectangle2();
		r.getArea();
	}
}