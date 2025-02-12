package HybridInheritance;

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " is cooking delicious meals.");
    }
}

class Waiter extends Person implements Worker {
    // Constructor
    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }
}
public class RestaurantManagementSystemWithHybrid {
    public static void main(String[] args) {
        Chef chef = new Chef("John", 101);
        Waiter waiter = new Waiter("Emily", 102);

        chef.displayDetails();
        chef.performDuties();

        waiter.displayDetails();
        waiter.performDuties();
    }
}