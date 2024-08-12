package corejava;
import java.util.*;
public class randomno {
	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		int Number = d.nextInt();
        int RandomInt = (int)(Math.random() * Number);
        System.out.println(RandomInt);
        d.close();
	}
}