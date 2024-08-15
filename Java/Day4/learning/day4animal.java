package corejava;
class Animals{
	void move() {
		System.out.println("moving");
	}
	void eat() {
		System.out.println("Eating");
	}
}
class Dogs extends Animals{
	void move() {
		System.out.println("Moving modified");
	}
	void eat() {
		System.out.println("Eating modified");
	}
}
public class day4animal {
	public static void main(String[] args) {
		Dogs d = new Dogs();
		d.move();
		d.eat();
	}
}