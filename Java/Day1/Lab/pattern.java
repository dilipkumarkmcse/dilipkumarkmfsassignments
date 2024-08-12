package corejava;
import java.util.*;
public class pattern {
	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		int Size = d.nextInt();
		for(int i = Size; i >= 0; i--) {
			for(int j = i; j < Size; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		d.close();
	}
}