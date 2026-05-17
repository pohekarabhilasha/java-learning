# 07 — Polymorphism

The third pillar of OOP — "many forms": the same action behaving differently depending on the object or arguments.

## What's in this folder

- `PolymorphismDemo.java` — `Calculator` class demonstrating method overloading (compile-time), and a `Shape` hierarchy with `Circle` and `Rectangle` demonstrating method overriding (runtime) and dynamic method dispatch
  
## Two Types of Polymorphism

- Compile time polymorphism
- Runtime polymorphism

## Concepts covered

### What is Polymorphism
"Many forms" — the ability of the same method to behave differently depending on the object or the arguments passed.

### Two types

| Type | Also called | Achieved by | Resolved at |
|------|-------------|-------------|-------------|
| Compile-time | Static / Early binding | Method **overloading** | Compile time |
| Runtime | Dynamic / Late binding | Method **overriding** | Runtime |

### Method Overloading (Compile-time)
- Same method name, **different parameter lists** (number, type, or order)
- Within the **same class**
- Return type alone cannot distinguish overloaded methods
- The compiler picks the correct method based on arguments

### Method Overriding (Runtime)
- A child class redefines a parent method — **same name, parameters, and return type**
- Requires **inheritance**
- A parent reference can point to a child object (**upcasting**)
- The JVM decides which version runs based on the actual object — called **dynamic method dispatch**

### Overloading vs Overriding

| Feature | Overloading | Overriding |
|---------|-------------|------------|
| Parameters | Different | Same |
| Where | Same class | Parent & child |
| Inheritance needed | No | Yes |
| Binding | Compile-time | Runtime |

### Why runtime polymorphism matters
It allows general, flexible code — many object types can be processed through a single parent reference without knowing the exact type at compile time.
