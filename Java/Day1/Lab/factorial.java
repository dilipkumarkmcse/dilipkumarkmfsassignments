package corejava;
import java.util.*;
public class factorial {
	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		int Number = d.nextInt();
		int Factorial = 1;
		for(int i = 1; i <= Number; i++) {
			Factorial *= i;
		}
		System.out.println(Factorial);
		d.close();
	}
}