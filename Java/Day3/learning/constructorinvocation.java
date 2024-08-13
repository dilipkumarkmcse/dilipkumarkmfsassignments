package corejava;
//without super
//class AC{
//	AC(){
//		System.out.println("A");
//	}
//	AC(int age){
//		System.out.println("AC");
//	}
//}
//class BD extends AC{
//	BD(){
//		System.out.println("B");
//	}
//}
//with super

//class AC{
//	AC(){
//		System.out.println("A");
//	}
//	AC(int age){
//		System.out.println("AC");
//	}
//}
//class BD extends AC{
//	BD(){
//		super(3);
//		System.out.println("B");
//	}
//}

class AC{
	AC(){
		this(5);
		System.out.println("A");
	}
	AC(int age){
		super();
		System.out.println("AC");
	}
}
class BD extends AC{
	BD(){
		super(3);
		System.out.println("B");
	}
	BD(int age){
		System.out.println("BD");
	}
}
//Externally passing value to object 
//class AC{
//	AC(){
//		System.out.println("A");
//	}
//	AC(int age){
//		System.out.println("AC");
//	}
//}
//class BD extends AC{
//	BD(){
//		super(3);
//		System.out.println("B");
//	}
//	BD(int age){
//		System.out.println("BD");
//	}
//}
public class constructorinvocation {
	public static void main(String[] args) {
		BD b = new BD(5);
	}
}