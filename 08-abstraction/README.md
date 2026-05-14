# 08 — Abstraction

The fourth pillar of OOP — hiding implementation details and exposing only essential features.

## What's in this folder

- `AbstractionDemo.java` — an abstract `Vehicle` class with abstract methods (`start`, `stop`) and a concrete method (`fuelType`), implemented by `Car` and `Motorcycle`

## Concepts covered

### What is Abstraction
Hiding the **implementation details** and showing only the **essential features**. It focuses on *what* an object does, not *how* it does it.

### How it's achieved in Java
1. **Abstract classes** — partial abstraction (0% to 100%)
2. **Interfaces** — full abstraction (see next topic)

### Abstract class rules
- Declared with the `abstract` keyword
- **Cannot be instantiated** directly
- Can have **both** abstract methods (no body) and concrete methods (with body)
- Can have constructors, fields, and static methods
- A child class must override all abstract methods, or be declared `abstract` itself

### Abstract method
- Declared with `abstract`, has **no body**, ends with a semicolon
- Forces every concrete subclass to provide its own implementation

### Abstraction vs Encapsulation
- **Abstraction** hides *implementation complexity* — the *how*
- **Encapsulation** hides *data* by making fields private and exposing controlled access

### Abstraction + Polymorphism
An abstract parent reference can point to different child objects, letting you treat them uniformly while the correct overridden method runs at runtime.