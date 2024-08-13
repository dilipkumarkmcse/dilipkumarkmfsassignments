package corejava;
class Twowheeler{
	void wheels() {
		System.out.println("Two wheeler");
	}
}
class Bike extends Twowheeler{
	void brand() {
		System.out.println("Ducati");
	}
}
public class singleinheritance {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.wheels();
		b.brand();
	}
}