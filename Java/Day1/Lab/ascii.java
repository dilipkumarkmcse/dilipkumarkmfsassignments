package corejava;
import java.util.*;
public class ascii {
	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		System.out.print("Enter the Starting character:");
		char Start = d.next().charAt(0);
		System.out.print("Enter the Ending character:");
		char End = d.next().charAt(0);
		for(int i = (int)Start; i <= (int)End; i++) {
			System.out.print(i + " ");
		}
		d.close();
	}
}