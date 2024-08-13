package corejava;
class Person{
	String Name;
	int Age;
	Person(String Name, int Age){
		this.Name = Name;
		this.Age = Age;
	}
}
public class personnameage {
	public static void main(String[] args) {
		Person p1 = new Person("DK", 20);
		Person p2 = new Person("CR", 39);
		System.out.println("Person 1 details" + "\n" + "Name : " + p1.Name + "\t" + "Age : " + p1.Age + "\n");
		System.out.println("Person 2 details" + "\n" + "Name : " + p2.Name + "\t" + "Age : " + p2.Age);
	}
}