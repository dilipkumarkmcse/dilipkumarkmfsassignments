package corejava;

public class methods {
	void method() {
		System.out.println("Instance Method");
	}
	static void method2() {
		System.out.println("Static Method");
	}
	public static void main(String[] args) {
		methods m = new methods();
		m.method();
		methods.method2();
	}

}
