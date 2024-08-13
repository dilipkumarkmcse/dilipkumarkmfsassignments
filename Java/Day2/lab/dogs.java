package corejava;
class Dog{
	String Name;
	String Breed;
	Dog(String Name, String Breed){
		this.Name = Name;
		this.Breed = Breed;
	}
	void setName(String Name) {
		this.Name = Name;
	}
	void setBreed(String Breed) {
		this.Breed = Breed;
	}
	void displaydog() {
		System.out.println("Name : " + Name + "\n" + "Breed : " + Breed + "\n");
	}
}
public class dogs {
	public static void main(String[] args) {
		Dog d1 = new Dog("John","German Shepherd");
		Dog d2 = new Dog("Tom","Siberian Husky");
		System.out.println("Dog 1 details");
		d1.displaydog();
		System.out.println("Dog 2 details");
		d2.displaydog();
		d1.setName("Tom");
		d1.setBreed("Rottweiler");
		d2.setName("John");
		d2.setBreed("Great Dane");
		System.out.println("After Updating" + "\n");
		System.out.println("Dog 1 details");
		d2.displaydog();
		System.out.println("Dog 2 details");
		d2.displaydog();
	}
}