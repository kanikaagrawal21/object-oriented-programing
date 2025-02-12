package ObjectRelationshipsAndCommunication;

import java.util.ArrayList;

// Book class (Independent Entity)
class Book {
    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Display book details
    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Library class (Aggregates multiple Book objects)
class Library {
    String libraryName;
    ArrayList<Book> books; // List of books in the library

    // Constructor
    Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    void addBook(Book book) {
        books.add(book);
    }

    // Display library details and its books
    void displayLibrary() {
        System.out.println("\nLibrary: " + libraryName);
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                book.displayBook();
            }
        }
    }
}

// Main class
public class LibraryAndBooks{
    public static void main(String[] args) {
        // Creating independent book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Creating libraries
        Library library1 = new Library("City Library");
        Library library2 = new Library("Community Library");

        // Adding books to libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book3);

        // Display library details
        library1.displayLibrary();
        library2.displayLibrary();
    }
}
