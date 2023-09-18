package bookManagement;

class Book {
	private int bookID;
	private String bookName;
	private String bookISBN;
	
	// constructor
	public Book(int id, String name, String isbn) {
		bookID = id;
		bookName = name;
		bookISBN = isbn;
	}
	
	// getter functions
	public int getBookID() {
		return bookID;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public String getBookISBN() {
		return bookISBN;
	}
	
	// setter functions
	public void setBookID(int id) {
		bookID = id;
	}
	
	public void setBookName(String name) {
		bookName = name;
	}
	
	public void setBookISBN(String isbn) {
		bookISBN = isbn;
	}
}