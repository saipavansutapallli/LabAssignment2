import java.util.Scanner;

public class BookTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 : sell books");
		System.out.println("Enter 2 : order new books");
		System.out.println("Enter 3 : display books");
		
		System.out.println("Enter 0 to exit the system");
		int num = sc.nextInt();

		Book[] books = { new Book("Python", "Mark Summerfield", "31", 7),
				new Book("Data Science", "Robert", "23", 9) };

		switch (num) {
		case 1:

			break;
		case 2:

			break;
		case 3:
			printBookInto(books);
			break;
	
		
		case 0:
			System.out.println("Exit!!");
			break;
		default:
			break;
		}
	}

	public static void printBookInto(Book[] books) {
		System.out.println("bookTitle " + " " + " bookAuthor " + " " + " ISBN " + " " + " numOfCopies ");
		for (int i = 0; i < books.length; i++) {
			books[i].display();
		}
	}
}
