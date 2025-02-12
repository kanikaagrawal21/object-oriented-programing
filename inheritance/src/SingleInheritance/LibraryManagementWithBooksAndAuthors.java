package SingleInheritance;

class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Title: " + title + ", Publication Year: " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }


    void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name + ", Bio: " + bio);
    }
}

public class LibraryManagementWithBooksAndAuthors {
    public static void main(String[] args) {
        Author bookWithAuthor = new Author("Java Basics", 2021, "John Doe", "Experienced Java Developer");
        bookWithAuthor.displayInfo();
    }
}
