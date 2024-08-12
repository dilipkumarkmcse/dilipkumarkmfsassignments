package corejava;
import java.util.*;
public class fibo {
	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		int First = 0,Second = 1;
		int n = d.nextInt();
		int FibonacciSum = 0;
		System.out.print(First + " " + Second + " ");
		for(int i = 0; i < n; i++) {
			FibonacciSum = First + Second;
			System.out.print(FibonacciSum + " ");
			First = Second;
			Second = FibonacciSum;
		}
		d.close();
	}
}