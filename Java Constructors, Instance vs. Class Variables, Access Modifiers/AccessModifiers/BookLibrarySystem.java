package AccessModifiers;

class Book {
    public int ISBN;
    protected String title;
    private String author;

    public void setAuthor(String Author){
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }
    class EBook extends Book{
        EBook(int ISBN,String title){
            this.ISBN=ISBN;
            this.title=title;

        }

    }
}
public class BookLibrarySystem {

    public static void main(String[] args) {


    }

}
