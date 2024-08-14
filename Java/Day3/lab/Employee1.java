package corejava;
class Employee2{
	void work() {
		System.out.println("Work");
	}
	void getSalary() {
		System.out.println("GetSalary");
	}
}
class HRManager extends Employee2{
	void work(){
		System.out.println("Work Modified");
	}
	void addEmployee() {
		System.out.println("Added Employee Method");
	}
}
public class Employee1 {
	public static void main(String[] args) {
		HRManager HR = new HRManager();
		HR.work();
		HR.getSalary();
		HR.addEmployee();
	}
}