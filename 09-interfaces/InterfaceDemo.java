// =====================================================
// INTERFACES in Java
//
// An interface is like a CONTRACT — a set of method names
// that any class implementing it MUST provide.
//
// Used to achieve:
//   1. FULL ABSTRACTION (traditionally — pre-Java 8)
//   2. MULTIPLE INHERITANCE (a class can implement many interfaces)
//   3. LOOSE COUPLING (code depends on interface, not concrete class)
//
// Keyword to define:     interface
// Keyword to use:        implements
//
// Key rules:
//   - All methods are public and abstract by default (pre-Java 8)
//   - All fields are public, static, final by default (constants)
//   - Cannot have a constructor — cannot be instantiated
//   - A class can implement MULTIPLE interfaces (comma-separated)
//   - An interface can extend other interfaces (with 'extends')
// =====================================================


// ---------- INTERFACE 1 ----------
interface Drivable {

    // Field — implicitly public, static, final (a constant)
    int MAX_SPEED = 200;

    // Abstract methods — implicitly public and abstract
    // No body — every implementing class must provide one
    void start();
    void stop();
    void accelerate();
}


// ---------- INTERFACE 2 ----------
interface Electric {
    void charge();
    void showBatteryLevel();
}


// ---------- A CLASS IMPLEMENTING ONE INTERFACE ----------
class Bike implements Drivable {

    String model;

    Bike(String model) {
        this.model = model;
    }

    // Must provide implementations for ALL methods of Drivable
    @Override
    public void start() {
        System.out.println(model + " starts with a kick.");
    }

    @Override
    public void stop() {
        System.out.println(model + " stops with hand brake.");
    }

    @Override
    public void accelerate() {
        System.out.println(model + " accelerates with throttle.");
    }
}


// ---------- A CLASS IMPLEMENTING MULTIPLE INTERFACES ----------
// This is how Java achieves MULTIPLE INHERITANCE — via interfaces.
class ElectricCar implements Drivable, Electric {

    String model;
    int batteryLevel;

    ElectricCar(String model, int batteryLevel) {
        this.model = model;
        this.batteryLevel = batteryLevel;
    }

    // Implementations for Drivable
    @Override
    public void start() {
        System.out.println(model + " starts silently.");
    }

    @Override
    public void stop() {
        System.out.println(model + " stops with regenerative braking.");
    }

    @Override
    public void accelerate() {
        System.out.println(model + " accelerates instantly.");
    }

    // Implementations for Electric
    @Override
    public void charge() {
        System.out.println(model + " is charging...");
        batteryLevel = 100;
    }

    @Override
    public void showBatteryLevel() {
        System.out.println(model + " battery: " + batteryLevel + "%");
    }
}


// =====================================================
// JAVA 8+ FEATURE: DEFAULT and STATIC methods in interfaces
//
// 'default' method — has a body, optional for implementers to override.
// 'static' method  — belongs to the interface itself, called via interface name.
// =====================================================
interface Greetable {

    void greet();   // abstract — must be implemented

    // default method — provides a default implementation
    default void sayHello() {
        System.out.println("Hello from the interface!");
    }

    // static method — called like:  Greetable.info()
    static void info() {
        System.out.println("Greetable is an interface.");
    }
}


class Person implements Greetable {

    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public void greet() {
        System.out.println("Hi, I'm " + name);
    }
    // Note: sayHello() is inherited from the interface as-is.
    // We CAN override it, but we don't have to.
}


public class InterfaceDemo {

    public static void main(String[] args) {

        // ---------- Single interface implementation ----------
        System.out.println("===== Bike implements Drivable =====");
        Bike bike = new Bike("Royal Enfield");
        bike.start();
        bike.accelerate();
        bike.stop();
        System.out.println("Max speed limit: " + Drivable.MAX_SPEED);


        // ---------- Multiple interface implementation ----------
        System.out.println("\n===== ElectricCar implements Drivable + Electric =====");
        ElectricCar tesla = new ElectricCar("Tesla Model 3", 40);
        tesla.start();
        tesla.accelerate();
        tesla.showBatteryLevel();
        tesla.charge();
        tesla.showBatteryLevel();
        tesla.stop();


        // ---------- Interface reference pointing to object ----------
        // Just like with abstract classes — interface references
        // can hold any implementing object.
        System.out.println("\n===== Interface reference =====");
        Drivable d = new Bike("Yamaha");
        d.start();        // calls Bike's version (runtime polymorphism)


        // ---------- Default and static methods (Java 8+) ----------
        System.out.println("\n===== Default & Static methods =====");
        Person p = new Person("Abhilasha");
        p.greet();          // implemented by Person
        p.sayHello();       // default method inherited from Greetable
        Greetable.info();   // static method called on the interface itself
    }
}