package corejava;
class Animal3{
	void move() {
		System.out.println("moved");
	}
}
class Cheetah extends Animal3{
	void move() {
		System.out.println("Cheetah Moved");
	}
}
public class Animalspecies {
	public static void main(String[] args) {
		Cheetah c = new Cheetah();
		c.move();
	}
}