package corejava;
class person1{
	void getFirstName() {
		System.out.println("First Name");
	}
	void getLastName() {
		System.out.println("Last Name");
	}
}
class Employee3 extends person1{
	void getEmployeeId() {
		System.out.println("Employee ID");
	}
	void getLastName() {
		System.out.println("Last Name Updated");
	}
	void  jobtitle() {
		System.out.println("Cyber Analyst");
	}
}
public class Persondetails {
	public static void main(String[] args) {
		Employee3 E = new Employee3();
		E.getFirstName();
		E.getLastName();
		E.getEmployeeId();
		E.jobtitle();
	}
}