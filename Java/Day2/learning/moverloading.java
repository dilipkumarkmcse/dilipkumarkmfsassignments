package corejava;

public class moverloading {
	void method(String name) {
		System.out.println(name);
	}
	void method(int a, int b) {
		System.out.println(a + b);	
	}
	void method(int n) {
		System.out.println(n);
	}
	public static void main(String[] args) {
		moverloading mo = new moverloading();
		mo.method(5);
		mo.method("DK");
		mo.method(3,4);
	}

}
