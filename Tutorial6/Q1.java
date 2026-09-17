// Q1: Runtime polymorphism with a Vehicle hierarchy (Car, Bike)
import java.util.*;

class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected double speed;

    Vehicle(String vehicleNumber, String brand, double speed) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.speed = speed;
    }

    void displayDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Brand          : " + brand);
        System.out.println("Speed          : " + speed + " km/h");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    Car(String vehicleNumber, String brand, double speed, int numberOfDoors) {
        super(vehicleNumber, brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void displayDetails() {
        System.out.println("--- Car Details ---");
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Bike extends Vehicle {
    private boolean hasGear;

    Bike(String vehicleNumber, String brand, double speed, boolean hasGear) {
        super(vehicleNumber, brand, speed);
        this.hasGear = hasGear;
    }

    @Override
    void displayDetails() {
        System.out.println("--- Bike Details ---");
        super.displayDetails();
        System.out.println("Has Gear       : " + (hasGear ? "Yes" : "No"));
    }
}

public class Q1 {
    public static void main(String[] args) {
        // Parent reference holding child objects -> runtime polymorphism
        Vehicle v;

        v = new Car("MH12AB1234", "Honda City", 180.5, 4);
        v.displayDetails();
        System.out.println();

        v = new Bike("MH14XY5678", "Royal Enfield", 140.0, true);
        v.displayDetails();
        System.out.println();

        // Same reference type, different method bodies chosen at run time
        Vehicle[] fleet = {
            new Car("KA05CD9012", "Maruti Swift", 165.0, 5),
            new Bike("KA03EF3456", "Honda Activa", 90.0, false)
        };

        System.out.println("=== Fleet Listing ===");
        for (Vehicle vehicle : fleet) {
            vehicle.displayDetails();
            System.out.println();
        }
    }
}
