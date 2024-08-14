package corejava;
class animal1{
	void makeSound() {
		System.out.println("Sound");
	}
}
class Cat extends animal1 {
	void makeSound() {
		System.out.println("Animals");
	}
}
public class Animal {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.makeSound();
	}
}