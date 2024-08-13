package corejava;
import java.util.*;
class Book{
	String Title;
	String Author;
	String ISBN;
	Book(String Title, String Author, String ISBN){
		this.Title = Title;
		this.Author = Author;
		this.ISBN = ISBN;
	}
	void display() {
		System.out.println("Tilte : " + Title + "\n" + "Author : " + Author + "\n" + "ISBN : " + ISBN + "\n");
	}
}
public class books {
	public static void main(String[] args) {
		List <Book> list = new ArrayList<>();
		Book b1 = new Book("Pride and Prejudice", "Jane Austen", "9781503290563");
		Book b2 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "9780590353427");
		Book b3 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "9780618574940");
		list.add(b1);
		b1.display();
		list.add(b2);
		b2.display();
		list.add(b3);
		b3.display();
		System.out.println("------------------------------------" + "\n" + "After Removing" + "\n" + "------------------------------------" + "\n");
		list.remove(b3);
		b1.display();
		b2.display();
	}
}