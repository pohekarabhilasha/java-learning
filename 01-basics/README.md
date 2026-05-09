# 01 — Java Basics & Fundamentals

The foundational concepts every Java program is built on.

## What's in this folder

- `HelloWorld.java` — your first Java program (class structure, main method, printing)
- `VariablesDemo.java` — local, instance, and static variables
- `DataTypesDemo.java` — primitive and non-primitive data types
- `TypeCastingDemo.java` — implicit (widening) and explicit (narrowing) casting
- `OperatorsDemo.java` — arithmetic, relational, logical, assignment, unary, bitwise operators

## Concepts covered

### Class & main method
Every Java program runs from a `public static void main(String[] args)` method inside a class. The file name must match the public class name.

### Variables
- **Local** — declared inside a method, no default value, lives only during method execution
- **Instance** — declared inside class outside methods, each object has its own copy, default value applies
- **Static** — one copy shared across all objects, belongs to the class

### Data Types
- **Primitive (8):** `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`
- **Non-primitive:** `String`, arrays, classes, interfaces

### Type Casting
- **Implicit (Widening):** automatic, smaller → larger, no data loss
- **Explicit (Narrowing):** manual using `(type)`, larger → smaller, may lose data

### Operators
- **Arithmetic** — `+ - * / %`
- **Relational** — `== != > < >= <=`
- **Logical** — `&& || !`
- **Assignment** — `= += -= *= /= %=`
- **Unary** — `++ -- + - !`
- **Bitwise** — `& | ^ ~ << >> >>>`

## How to run

```bash
javac VariablesDemo.java
java VariablesDemo
```

Or in Eclipse: right-click the file → **Run As → Java Application**