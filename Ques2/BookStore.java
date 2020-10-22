
public class BookStore {
	private Book book[];
	private static int SIZE;
	public BookStore() {
		SIZE = 16;
		book = new Book[SIZE];
	}
	public BookStore(Book[] book) {
		super();
		this.book = book;
	}
	public void sellBook(String bookTitle, int numOfCopies) {
		int index = -1;
		for (int i = 0; i < book.length; i++) {
			if (bookTitle.equalsIgnoreCase(book[i].getBookTitle()) && book[i].getNumOfCopies()!=0 && numOfCopies <= book[i].getNumOfCopies()) {
				int copies = book[i].getNumOfCopies() - numOfCopies;
				book[i].setNumOfCopies(copies);
				index  = i;
			}
		}
		if( index != -1) {
			System.out.println("Remaining copies of python book");
			book[index].display();
		} else {
			System.out.println("Book not found");
		}
	}
	
	public void orderBooks(String iSBN, int numOfCopies) {
		int index = -1;
		for(int i=0; i<book.length; i++) {
			if(iSBN.equals(book[i].getISBN()) ) {
				book[i].setNumOfCopies(book[i].getNumOfCopies() + numOfCopies);
				index = i;
			}
		}
		if(index != -1) {
			System.out.println("Added books");
		} else {
			System.out.println("Book was not found");
		}
	}
	
	public void printBookDetails() {
		for (int i = 0; i < book.length; i++) {
			book[i].display();
		}
	}
}