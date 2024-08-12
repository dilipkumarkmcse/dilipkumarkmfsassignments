import java.util.Scanner;
public class First{
	public static void main(String[] a){
		Scanner d = new Scanner(System.in);
		System.out.println("Student Id");
		int sid = d.nextInt();
		System.out.println("Student Name");
		String sname = d.next();
		System.out.println("Student Salary");
		float ssalary = d.nextFloat();
		System.out.println("Student Id : " + sid);
		System.out.println("Student Name : " + sname);
		System.out.println("Student Salary : " + ssalary);
	}
}