package HybridInheritance;

class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayDetails() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {
    // Constructor
    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
    void charge() {
        System.out.println(model + " is charging.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    // Constructor
    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void refuel() {
        System.out.println(model + " is refueling.");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200);
        PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 180);

        ev.displayDetails();
        ev.charge();

        pv.displayDetails();
        pv.refuel();
    }
}
