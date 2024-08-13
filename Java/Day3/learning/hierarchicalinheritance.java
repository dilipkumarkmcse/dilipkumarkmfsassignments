package corejava;
class Football{
	void players() {
		System.out.println("parent");
	}
}
class Cr extends Football{
	void player1() {
		System.out.println("Cristiano");
	}
}
class Me extends Football{
	void player2() {
		System.out.println("Messi");
	}
}
public class hierarchicalinheritance {
	public static void main(String[] args) {
		Cr C = new Cr();//child1 and parent class
		C.players();
		C.player1();
		System.out.println();
		Me M = new Me();//child2 and parent class
		M.players();
		M.player2();
	}
}