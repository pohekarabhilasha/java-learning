# 04 — OOP Basics

The foundation of Object-Oriented Programming in Java — classes, objects, and constructors.

## What's in this folder

- `ClassObjectDemo.java` — defining a class, creating objects, accessing fields and methods, default field values
- `ConstructorDemo.java` — default constructor, parameterized constructor, constructor overloading, `this` keyword, `this(...)` constructor chaining

## Concepts covered

### Class
- A **blueprint** that defines fields (data) and methods (behavior)
- Doesn't take memory by itself — only when an object is created
- Only one `public` class per file; its name must match the file name 

### Object
- An **instance** of a class, created using the `new` keyword
- Each object has its own copy of fields
- Stored in **heap memory**; the reference variable lives in stack

### Syntax
```java
ClassName objectName = new ClassName();
```

### Default field values
- Numeric → `0` / `0.0`
- Boolean → `false`
- Reference (String, objects, arrays) → `null`

### Constructor
- A special method that **initializes** an object
- Same name as the class, **no return type** (not even `void`)
- Called automatically when `new` is used

| Type | Description |
|------|-------------|
| Default | No parameters. Java provides one automatically if no constructor is written. |
| Parameterized | Accepts arguments to set field values during creation. |
| Overloaded | Multiple constructors in the same class with different parameter lists. |

### `this` keyword
- Refers to the **current object**
- Distinguishes fields from parameters when names clash (`this.title = title;`)
- `this(...)` calls another constructor of the same class — must be the first statement
