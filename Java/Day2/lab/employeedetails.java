package corejava;
class Employees{
	String Name;
	String JobTitle;
	int Salary;
	Employees(String Name, String JobTitle, int Salary){
		this.Name = Name;
		this.JobTitle = JobTitle;
		this.Salary = Salary;
	}
	void display() {
		System.out.println("Name : " + Name + "\n" + "JobTitle : " + JobTitle + "\n" + "Salary : " + Salary);
	}
	public void raisesalary(double Percentage) {
		if(Percentage > 0) {
			double Increase = Salary * (Percentage / 100);
			Salary += Increase;
			System.out.println("----------------------------"  + "\nSalary Increased by " + Percentage + "%");
		}
		else {
			System.out.println("----------------------------"  + "\nSalary Percentage Should be Positive");
		}
	}
}
public class employeedetails {
	public static void main(String[] args) {
		Employees emp = new Employees("DK", "CyberAnalyst", 90000);
        System.out.println("----------------------------" + "\nEmloyee Details" + "\n----------------------------");
		emp.display();
		emp.raisesalary(7);
        System.out.println("----------------------------" + "\nUpdated Emloyee Details" + "\n----------------------------");
        emp.display();
	}
}