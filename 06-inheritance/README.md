# 06 — Inheritance

The second pillar of OOP — one class acquiring the fields and methods of another.

## What's in this folder

- `InheritanceDemo.java` — `Animal` parent class with `Dog` and `Cat` child classes; demonstrates `extends`, method overriding, the `super` keyword, and constructor call order

## Concepts covered

### What is Inheritance
A mechanism where a **child class** acquires the fields and methods of a **parent class** using the `extends` keyword. Represents an **"IS-A"** relationship (a Dog IS-A Animal).

### Terminology
| Term | Meaning |
|------|---------|
| Parent / Superclass / Base class | The class being inherited from |
| Child / Subclass / Derived class | The class that inherits |
| `extends` | Keyword to establish inheritance |

### Types of inheritance in Java
- **Single** — one child, one parent
- **Multilevel** — a chain of inheritance
- **Hierarchical** — multiple children share one parent
- **Multiple inheritance with classes is NOT allowed** — avoids the Diamond Problem; achieved using interfaces instead

### `super` keyword — 3 uses
1. `super(...)` — calls the parent's constructor (must be the first statement in the child constructor)
2. `super.method()` — calls the parent's version of an overridden method
3. `super.field` — accesses a parent's field hidden by a child field of the same name

### Method Overriding
A child class provides its own implementation of a parent method — same name, parameters, and return type. Use the `@Override` annotation so the compiler verifies it. This is the basis of runtime polymorphism.

### Constructor call order
When a child object is created, the **parent constructor runs first**, then the child constructor. Java automatically inserts `super()` if not written explicitly.

### Object class
Every Java class implicitly extends `Object` — the root of the class hierarchy.