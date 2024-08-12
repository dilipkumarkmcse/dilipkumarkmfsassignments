package corejava;
import java.util.*;
public class prime {
	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		int n = d.nextInt();
		if((n % 2 != 0 && n != 1 ) || n == 2) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
		d.close();
	}
}