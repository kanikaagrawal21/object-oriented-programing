package StaticsInstanceFinalKeywords;
class Book{
    static String libraryName ="srm";
   static String author;
   static String title;
    final int isbn;

    Book(String author,String title,int isbn){
        this.author=author;
        this.title=title;
        this.isbn=isbn;
    }
    static void displayLibraryName(){
        System.out.println("libraryName"+libraryName );
        System.out.println("title"+title);
        System.out.println("author"+author);

    }
    void displayIsbn(){
        System.out.println("isbn:"+isbn);
    }



}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book = new Book("kanika","holiday",21);
        book.displayIsbn();
        book.displayLibraryName();
    }
}
