
public class Book {
    private String bookTitle;
	private String Author;
	private String ISBN;
	private int numOfCopies;
    
	public Book(String bookTitle, String Author, String ISBN, int numOfCopies) {
		this.bookTitle = bookTitle;
		this.Author = Author;
		this.ISBN = ISBN;
		this.numOfCopies = numOfCopies;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getBookAuthor() {
		return Author;
	}

	public String getISBN() {
		return ISBN;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

	public void display() {
		System.out.println(bookTitle + " " + Author + " " + ISBN + " " + numOfCopies);
	}

}
