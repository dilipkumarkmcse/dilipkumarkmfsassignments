package corejava;
public class variables {
	int b = 20;//instance variable
	static int c = 10;//static variable
	public static void main(String[] args) {
		//local variable
		int a = 10;
		System.out.println("Local Variable : " + a);
		//instance variable
		variables v = new variables();
		System.out.println(v.b);
		//static variable
		System.out.println(variables.c);
	}
}