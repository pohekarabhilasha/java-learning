# 05 — Encapsulation

The first pillar of OOP — wrapping data and methods into a single unit, and hiding the data from outside access.

## What's in this folder

- `EncapsulationDemo.java` — a `BankAccount` class with private fields, getters, setters with validation, and controlled behavior methods (`deposit`, `withdraw`)

## Concepts covered

### What is Encapsulation
Binding **data (fields)** and the **methods** that act on them into one unit (a class), while hiding the internal data. Also called **data hiding**.

### How to achieve it in Java
1. Declare fields as `private`
2. Provide `public` **getter** methods to read them
3. Provide `public` **setter** methods to modify them — ideally with validation

### Benefits
- **Data hiding** — internal state cannot be changed directly from outside
- **Control** — setters can validate input before applying changes
- **Flexibility** — internal implementation can change without breaking external code
- **Maintainability** — all data changes go through controlled methods

### Key principle
True encapsulation is not just blindly adding getters/setters for every field — it's about exposing **only what should be exposed**. In the example, there is no `setBalance()`; instead, `deposit()` and `withdraw()` modify the balance safely.

### Encapsulation vs Abstraction
- **Encapsulation** hides *data* — the internal state
- **Abstraction** hides *implementation complexity* — the *how*