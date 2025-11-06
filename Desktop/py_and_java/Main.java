// Base class Vehicle
class Vehicle {
    String brand;
    String fuel;

    // No-argument constructor
    Vehicle() {
        brand = "Unknown";
        fuel = "Unknown";
    }
}

// Subclass Car inherits Vehicle
class Car extends Vehicle {
    int doors;

    // Constructor for Car class
    Car(String brand, String fuel, int doors) {
        // Implicitly calls Vehicle() no-argument constructor (super()).
        this.doors = doors;
        this.brand = brand;
        this.fuel = fuel;
    }

    // Method to simulate driving and consuming fuel
    void drive() {
        System.out.println("Driving the " + brand + " car with " + doors + " doors, consuming fuel: " + fuel);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Gasoline", 4);
        myCar.drive();  // Output: Driving the Toyota car with 4 doors, consuming fuel: Gasoline
    }
}
