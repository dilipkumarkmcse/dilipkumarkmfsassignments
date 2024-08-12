package corejava;
import java.util.*;
class Employee{
	int employeeId;
	String employeeName;
	float employeeSalary;
	Employee(int employeeId, String employeeName, float employeeSalary){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	void display() {
		System.out.println("Employee Id : " + employeeId + "\n" + "Employee Name : " + employeeName + "\n" + "Employee Salary : " + employeeSalary);
	}
}
public class object {
	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		Employee e1 = new Employee(7, "Cris", 7777.7f);
		e1.display();
		Employee e2 = new Employee(10, "mess", 1010.1f);
		e2.display();
		d.close();
	}
}