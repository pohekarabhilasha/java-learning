// =====================================================
// ABSTRACTION — the fourth pillar of OOP
//
// Abstraction = hiding the IMPLEMENTATION details and
// showing only the ESSENTIAL features / functionality.
//
// "WHAT it does" is shown.  "HOW it does it" is hidden.
//
// Real-world analogy:
//   You drive a car using the steering, accelerator, brake.
//   You don't need to know HOW the engine internally works.
//   The complexity is abstracted away.
//
// In Java, abstraction is achieved using:
//   1. Abstract classes   (partial abstraction — 0 to 100%)
//   2. Interfaces         (full abstraction — covered next topic)
//
// This file focuses on ABSTRACT CLASSES.
// =====================================================


// ---------- ABSTRACT CLASS ----------
// Declared with the 'abstract' keyword.
//
// Rules:
//   - CANNOT be instantiated (no 'new Vehicle()')
//   - CAN have abstract methods (no body) AND concrete methods (with body)
//   - CAN have constructors, fields, and static methods
//   - A child class MUST override all abstract methods,
//     OR be declared abstract itself.
abstract class Vehicle {

    // A normal field
    String name;

    // Abstract classes CAN have constructors
    // (called when a child object is created, via super())
    Vehicle(String name) {
        this.name = name;
    }

    // -------- ABSTRACT METHOD --------
    // No body — just the declaration ending with a semicolon.
    // It says "every Vehicle MUST have a start() behavior,
    // but each type defines it differently."
    abstract void start();

    abstract void stop();

    // -------- CONCRETE METHOD --------
    // Abstract classes CAN also have fully implemented methods.
    // Shared behavior goes here — no need for children to rewrite it.
    void fuelType() {
        System.out.println(name + " runs on fuel/electricity.");
    }
}


// ---------- CONCRETE CHILD CLASS ----------
// Must provide implementations for ALL abstract methods.
class Car extends Vehicle {

    Car(String name) {
        super(name);   // call abstract parent's constructor
    }

    @Override
    void start() {
        System.out.println(name + " starts with a key/ignition button.");
    }

    @Override
    void stop() {
        System.out.println(name + " stops by pressing the brake pedal.");
    }
}


class Motorcycle extends Vehicle {

    Motorcycle(String name) {
        super(name);
    }

    @Override
    void start() {
        System.out.println(name + " starts with a self-start or kick.");
    }

    @Override
    void stop() {
        System.out.println(name + " stops using hand and foot brakes.");
    }
}


public class AbstractionDemo {

    public static void main(String[] args) {

        // -------- CANNOT do this --------
        // Vehicle v = new Vehicle("Generic");   // ❌ compile error
        // Abstract classes cannot be instantiated directly.

        // -------- Create concrete child objects --------
        Car car = new Car("Honda City");
        car.start();
        car.stop();
        car.fuelType();       // inherited concrete method

        System.out.println("---");

        Motorcycle bike = new Motorcycle("Royal Enfield");
        bike.start();
        bike.stop();
        bike.fuelType();

        System.out.println("---");

        // -------- Abstraction + Polymorphism together --------
        // A parent (abstract) reference pointing to child objects.
        // We can treat all vehicles uniformly without knowing the
        // exact type — the correct overridden method runs at runtime.
        Vehicle[] vehicles = {
            new Car("Tesla Model 3"),
            new Motorcycle("Yamaha R15")
        };

        for (Vehicle v : vehicles) {
            v.start();   // calls the right child's version
            v.stop();
            System.out.println("---");
        }
    }
}