# 09 — Interfaces

A contract that defines a set of method signatures any implementing class must provide. Used for full abstraction, multiple inheritance, and loose coupling.

## What's in this folder

- `InterfaceDemo.java` — `Drivable` and `Electric` interfaces, single implementation (`Bike`), multiple implementation (`ElectricCar`), and Java 8+ `default` and `static` methods via the `Greetable` interface

## Concepts covered

### What is an Interface
A **contract** defining method signatures. A class that `implements` an interface must provide implementations for all its abstract methods.

### Rules
- Defined with the `interface` keyword; used with `implements`
- All methods are `public` and `abstract` by default (pre-Java 8)
- All fields are `public static final` by default (constants)
- Cannot be instantiated — no constructors
- A class can implement **multiple interfaces** (comma-separated)
- An interface can `extends` other interfaces

### Java 8+ enhancements
- **`default` methods** — have a body; implementers can use as-is or override
- **`static` methods** — belong to the interface; called as `InterfaceName.method()`

### How Java achieves multiple inheritance
A class can `extends` only one class, but can `implements` many interfaces. This avoids the Diamond Problem while still allowing multiple capabilities.

### Abstract class vs Interface

| Feature | Abstract Class | Interface |
|---------|----------------|-----------|
| Keyword | `abstract class` | `interface` |
| Use with | `extends` | `implements` |
| Methods | Abstract + concrete | Abstract + `default` + `static` |
| Fields | Any | `public static final` only |
| Constructor | Yes | No |
| Multiple inheritance | One parent only | Many allowed |

### Rule of thumb
- **IS-A** relationship with shared state and code → abstract class
- **CAN-DO** a capability across unrelated classes → interface

For example, a `Bird` IS-A `Animal` (abstract class), but `Bird` CAN-DO `Flyable` (interface).