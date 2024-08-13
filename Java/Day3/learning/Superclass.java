package corejava;
class A{
	int a = 10;
	A (String name){
		System.out.println("Welcome home " + name);
	}
	void methodA() {
		System.out.println("Superclass");
	}
}
class B extends A{
	B(){
		super("DK");
	}
	void methodB() {
		System.out.println("Super class variable : " +	super.a);
		super.methodA();
	}
}
public class Superclass {
	public static void main(String[] args) {
		B b = new B();
		b.methodB();
	}
}