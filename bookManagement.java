package bookManagement;

import java.util.HashMap;

class bookManagement {
	
	private HashMap<Integer, Book> bookDB = new HashMap<>();
	
	// function to add a new book
	public void addBook(Book b) {
		bookDB.put(b.getBookID(), b);
	}
	
	// function to display all books
	public void showAllBook() {
		System.out.println("Details of the book:");
		System.out.println("Book ID	| 	Name 	| ISBN");
		
//		for(Book i : bookDB) {
//			System.out.println(bookID + "	" + bookName + "	" + bookISBN);
//		}
	}
	
	// function to display one particular book
	public void showOneBook(int bookID) {
		Book targetBook = bookDB.get(bookID);
		System.out.println("Details of the book:");
		System.out.println("bookID: " + targetBook.getBookID());
		System.out.println("bookName: " + targetBook.getBookName());
		System.out.println("bookISBN: " + targetBook.getBookISBN());
	}
	
	// function to update a book
	public void updateBook(Book b) {
		bookDB.put(b.getBookID(), b);
	}
	
	// function to delete a book
	public void deleteBook(int bookID) {
		bookDB.remove(bookID);
	}
}
