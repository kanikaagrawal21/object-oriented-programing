package InstanceAndClassVariables;
 class Vehicle{
     String ownerName;
     String vehicleType;

     static int registrationFee = 5000;
      Vehicle(String ownerName,String vehicleType){
          this.ownerName= ownerName;
          this.vehicleType=vehicleType;
          registrationFee=registrationFee;

      }
      void displayVehicleDetails(){
          System.out.println("Owner Name"+ownerName);
          System.out.println("vehicle type"+vehicleType);
          System.out.println("fee"+registrationFee);
      }
 }
public class VehicleRegistration {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("kanika","shotgun");
        v.displayVehicleDetails();
    }
}
