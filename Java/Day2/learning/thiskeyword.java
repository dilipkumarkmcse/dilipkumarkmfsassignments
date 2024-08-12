package corejava;
public class thiskeyword {
	String name;
	thiskeyword(String name){
		this(3,4);
		this.name = name;
		this.greeting();
	}
	thiskeyword(int a, int b){
		System.out.println("Addition : " + (a+b));
	}
	void greeting() {
		System.out.println("Welcome home "+ name);
	}
	public static void main(String[] args) {
		thiskeyword tk = new thiskeyword("DK");
	}
}