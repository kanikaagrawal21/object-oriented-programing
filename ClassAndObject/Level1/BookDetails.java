package ClassAndObjectLevelOne;

class Book {

    private String name;
    private String authorName;
    private int price;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthorName(String authorName){
        this.authorName=authorName;
    }
    public void setPrice(int Price){
        this.price=price;
    }



    // Getter methods
    public int getPrice() {
        return price;
    }
    public String getName(){
        return name;
    }
    public String getAuthorName(){
        return authorName;
    }

}
public class BookDetails {
    public static void main(String[] args) {
         Book b = new Book();
         b.setAuthorName("kanika");
         b.setName("holiday");
         b.setPrice(1500);
        System.out.println(b.getAuthorName());
        System.out.println(b.getName());
        System.out.println(b.getPrice());

    }
}
