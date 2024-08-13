package corejava;
class Animal{
	void species() {
		System.out.println("Grand parent");
	}
}
class Panther extends Animal{
	void pan() {
		System.out.println("parent");
	}
}
class BabyPanther extends Panther{
	void babpan() {
		System.out.println("Child");
	}
}
public class multilevelinheritance {
	public static void main(String[] args) {
		BabyPanther B = new BabyPanther();
		B.species();
		B.pan();
		B.babpan();
	}
}