package ClassAndObjectLevelOne;
class MobilePhone{
   private String brand;
   private String model;
   private int price;

   public void display(){
       System.out.println("model"+model);
       System.out.println("brand"+brand);
       System.out.println("price"+price);
   }
}

public class MobilePhoneDetails {
    public static void main(String[] args) {
        MobilePhone m = new MobilePhone();
        m.display();
    }
}
