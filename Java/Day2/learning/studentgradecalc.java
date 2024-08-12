package corejava;
import java.util.*;
class Student{
	int regNo;
	String studentName;
	int Marks[] = new int[5];
	int Sum,Avg;
	String Grade;
	Student(int regNo, String studentName) {
		this.regNo = regNo;
		this.studentName = studentName;
	}
	void getmarks() {
		Scanner d = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			Marks[i] = d.nextInt();
		}
		d.close();
	}
	void calculategrade() {
		Sum = 0;
		for(int i = 0; i < Marks.length; i++) {
			Sum += Marks[i];
		}
		Avg = Sum/Marks.length;
		if(Avg > 90 && Avg <= 100) {
			Grade = "Grade O";
		}
		else if(Avg > 80 && Avg <= 90) {
			Grade = "Grade A+";
		}
		else if(Avg > 70 && Avg <= 80) {
			Grade = "Grade A";
		}
		else if(Avg > 60 && Avg <= 70) {
			Grade = "Grade B+";
		}
		else if(Avg > 50 && Avg <= 60) {
			Grade = "Grade B";
		}
		else if(Avg == 50) {
			Grade = "Grade c";
		}
		else {
			Grade = "Fail";
		}
	}
	void displayreport() {
		System.out.println("Student Reg-No : " + regNo);
		System.out.println("Student Name : " + studentName);
		System.out.println("Average : " + Avg);
		System.out.println("Grade : " + Grade);
	}
}
public class studentgradecalc {
	public static void main(String[] args) {
		Student s = new Student(7,"DK");
		s.getmarks();
		s.calculategrade();
		s.displayreport();
	}
}