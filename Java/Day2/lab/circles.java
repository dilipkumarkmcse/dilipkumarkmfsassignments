package corejava;
class Circle{
	double radius;
	double Area;
	double Circumference;
	Circle(double radius){
		this.radius = radius;
	}
	void setRadius(double radius) {
		this.radius = radius;
	}
	void calculate() {
		Area = (22/7)*(radius * radius);
		Circumference = 2 * (22/7) * radius;
		System.out.println("Area of the Circle : " + Area + "\n" + "Circumference of the Circle : " + Circumference);
	}
}
public class circles {
	public static void main(String[] args) {
		Circle c = new Circle(4);
		System.out.println("Area & Circumference of the Circle" + "\n");
		c.calculate();
		System.out.println("------------------------------------------" + "\n" + "After Updating" + "\n" + "------------------------------------------");
		System.out.println("Area & Circumference of the Circle" + "\n");
		c.setRadius(5);
		c.calculate();
		
	}
}