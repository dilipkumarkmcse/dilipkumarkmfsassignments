package corejava;
class FinalExample {
    final int value = 100;

    final void display() {
        System.out.println("Value: " + value);
    }
}
public class Finalkeyword {
	public static void main(String[] args) {
		FinalExample example = new FinalExample();
		example.display();
	}
}