class Library{
	String[] books;
	int no_of_books;
	Library(){
		this.books=new String[100];
		this.no_of_books=0;
		System.out.println(books +"has been added!");
	}
	void addBook(String book) {
		this.books[no_of_books]=book;
		no_of_books++;
		System.out.println(book +"has been added!");
	}
	void showAvailabeBooks() {
		System.out.println("Availabe books are:");
		for(String book:this.books) {
			if(book==null) {
				continue;
			}
			System.out.println("*"+ book);
		}
	}
	void issueBook(String book) {
		for (int i=0;i<this.books.length;i++) {
		if(this.books[i].equals(book)) {
			
				System.out.println("The books has been issued!");
				this.books[i]=null;
				return;
			}	
		}
		System.out.println("This book does not exist");
	}
	 void returnBook(String book) {
		 addBook(book);
		 
	 }
}
public class LIbrary_book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Library centralLibrary=new Library();
      centralLibrary.addBook("think and grow rich");
      centralLibrary.addBook("Algorithm");
      centralLibrary.addBook("Harry potter");
      centralLibrary.addBook("c++");
      centralLibrary.addBook("java");
      centralLibrary.showAvailabeBooks();
      centralLibrary.issueBook("c++");
      centralLibrary.showAvailabeBooks();
      centralLibrary.returnBook("c++");
      centralLibrary.showAvailabeBooks();
	}

}
