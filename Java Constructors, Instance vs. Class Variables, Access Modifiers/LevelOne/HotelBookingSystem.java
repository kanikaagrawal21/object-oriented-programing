package LevelOne;

 class HotelBooking{
    String guestName;
    String roomType;
    int nights;
    public void HotelBooking(){
        this.guestName="unknown";
        this.roomType="standard";
        this.nights= 1;
    }
    public void HotelBooking(String guestName,String roomType,int nights){
        guestName=guestName;
        roomType = roomType;
        nights=nights;
    }
    public void HotelBooking(HotelBooking booking){
        guestName=booking.guestName;
        roomType= booking.roomType;
        nights= booking.nights;
    }
    void displayBooking(){
        System.out.println("guestName:"+guestName);
        System.out.println("roomType:"+roomType);
        System.out.println("nights"+nights);
    }

}
public class HotelBookingSystem {
    public static void main(String[] args) {
        HotelBooking b = new HotelBooking();
        b.displayBooking();

    }
}
