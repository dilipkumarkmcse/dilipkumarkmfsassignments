package corejava;

public class coverloading {
	coverloading(String name) {
		System.out.println(name);
	}
	coverloading(int a, int b) {
		this("DK");
		System.out.println(a + b);	
	}
	coverloading(int n) {
		this(3,4);
		System.out.println(n);
	}
	public static void main(String[] args) {
		coverloading co = new coverloading(5);
	}
}
