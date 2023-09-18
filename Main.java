package bookManagement;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		bookManagement bookManager = new bookManagement();
		
		while(true) {
			System.out.println("Enter your choice according to the following operations: ");
			System.out.println("1. Add a new book");
			System.out.println("2. Show details of all the books");
			System.out.println("3. Show details of one book");
			System.out.println("4. Update a book");
			System.out.println("5. Delete a book");
			System.out.println("6. Exit");
		
			int n = sc.nextInt();
		
			switch(n) {
			case 1: 
				System.out.println("Enter Book ID: ");
				int bookID = sc.nextInt();
				System.out.println("Enter Book Name: ");
				String bookName = sc.nextLine();
				System.out.println("Enter Book ISBN: ");
				String bookISBN = sc.nextLine();
			
				Book newBook = new Book(bookID, bookName, bookISBN);
				bookManager.addBook(newBook);
				break;
			
			case 2:
				bookManager.showAllBook();
				break;
			
			case 3:
				System.out.println("Enter Book ID: ");
				int showBookID = sc.nextInt();
				bookManager.showOneBook(showBookID);
				break;
			
			case 4:
				System.out.println("Enter Book ID: ");
				int id = sc.nextInt();
				System.out.println("Enter Book Name: ");
				String name = sc.nextLine();
				System.out.println("Enter Book ISBN: ");
				String isbn = sc.nextLine();
				System.out.println("Enter Book ID: ");
				
				Book updateBook = new Book(id, name, isbn);
				bookManager.updateBook(updateBook);
				break;
			
			case 5:
				System.out.println("Enter Book ID: ");
				int delBookID = sc.nextInt();
				bookManager.deleteBook(delBookID);
				break;
				
			case 6:
				return;
			
			default:
			}
		}
	}

}
