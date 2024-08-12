package corejava;
import java.util.*;
public class armstrong {
	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		int Number = d.nextInt();
		int Snumber = Number;
		int Count = 0;
		while(Snumber > 0) {
			Snumber = Snumber / 10;
			Count++;
		}
		int Remainder = 0;
		double Sum = 0;
		while(Snumber > 0) {
			Remainder = Snumber % 10;
			Sum += Math.pow(Remainder,Count);
			Snumber /= 10;
		}
		if(Snumber == Sum) {
			System.out.println("ArmStrong Number");
		}
		else {
			System.out.println("Not an ArmStrong Number");
		}
		d.close();
	}
}