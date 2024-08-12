package corejava;
public class objcmp {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		if (obj1.equals(obj2)) {
		    System.out.println("Objects are equal");
		} else {
		    System.out.println("Objects are not equal");
		}
	}
}