package corejava;
class Animals1{
	int b = 10;
	void move() {
		System.out.println("moving");
	}
	void eat() {
		System.out.println("Eating");
	}
}
class Dogs1 extends Animals1{
	int b = 20;
	void move() {
		System.out.println("Moving modified");
	}
	void eat() {
		System.out.println("Eating modified");
	}
}
public class DMD {
	public static void main(String[] args) {
		Animals1 a;
		a = new Animals1();
		a.move();
		a.eat();
		System.out.println(a.b);
	}
}