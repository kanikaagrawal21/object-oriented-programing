package LevelOne;

import java.sql.SQLOutput;

class CarRental{
     String customerName;
     String carModel;
     int rentalDays;

     public int price(int days,int price){
         int totalprice = days*price;
         return totalprice;
     }
 }
public class CarRentalSystem {
    public static void main(String[] args) {
         CarRental c = new CarRental();
         c.price(3,1000);
    }

}
