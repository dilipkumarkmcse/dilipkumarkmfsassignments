package corejava;
import java.util.*;
public class palindrome {
	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		int Number = d.nextInt();
		int Temporary = Number;
		int Remainder = 0, Sum=0;
		while(Number > 0) {
			Remainder = Number % 10;
			Sum = (Sum * 10) + Remainder;
			Number /= 10;
		}
		if(Temporary == Sum) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		d.close();
	}
}