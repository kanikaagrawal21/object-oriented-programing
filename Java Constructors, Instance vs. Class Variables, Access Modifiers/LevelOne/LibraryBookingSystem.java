package LevelOne;

class Books{
    String title;
    String author;
    int price;
    String availability;

    public boolean isAvailable(String name){
         boolean isAvailable = true;
         if(isAvailable==true){
             System.out.println("book is available");

         }
        isAvailable=false;
        return isAvailable;
    }

}
public class LibraryBookingSystem {
    public static void main(String[] args) {
        Books b = new Books();
        b.isAvailable("holiday");
    }
}
