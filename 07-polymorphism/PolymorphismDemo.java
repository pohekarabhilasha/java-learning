// =====================================================
// POLYMORPHISM — the third pillar of OOP
//
// Polymorphism = "many forms".
// The SAME action behaves DIFFERENTLY based on the object
// or the arguments involved.
//
// Two types in Java:
//
//   1. COMPILE-TIME polymorphism (Static binding)
//      → achieved by METHOD OVERLOADING
//      → resolved by the compiler, before the program runs
//
//   2. RUNTIME polymorphism (Dynamic binding)
//      → achieved by METHOD OVERRIDING
//      → resolved by the JVM, while the program runs
// =====================================================


// =====================================================
// PART 1 — COMPILE-TIME POLYMORPHISM (Method Overloading)
//
// Method Overloading = multiple methods with the SAME name
// but DIFFERENT parameter lists (different number, type, or
// order of parameters) in the SAME class.
//
// The compiler decides which method to call based on the
// arguments you pass — this happens at COMPILE time.
// =====================================================
class Calculator {

    // Same method name 'add', different parameter lists

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {        // different NUMBER of params
        return a + b + c;
    }

    double add(double a, double b) {      // different TYPE of params
        return a + b;
    }

    String add(String a, String b) {      // works with Strings too
        return a + b;
    }
}


// =====================================================
// PART 2 — RUNTIME POLYMORPHISM (Method Overriding)
//
// A parent reference variable can point to a child object.
// When an overridden method is called, the JVM decides at
// RUNTIME which version to run — based on the ACTUAL OBJECT,
// not the reference type.
//
// This is also called DYNAMIC METHOD DISPATCH.
// =====================================================
class Shape {
    void draw() {
        System.out.println("Drawing a generic shape");
    }

    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    double area() {
        return length * width;
    }
}


public class PolymorphismDemo {

    public static void main(String[] args) {

        // ---------- COMPILE-TIME POLYMORPHISM ----------
        System.out.println("===== Method Overloading (Compile-time) =====");
        Calculator calc = new Calculator();

        System.out.println("add(2, 3)        = " + calc.add(2, 3));
        System.out.println("add(2, 3, 4)     = " + calc.add(2, 3, 4));
        System.out.println("add(2.5, 3.5)    = " + calc.add(2.5, 3.5));
        System.out.println("add(\"Hi \", \"Bye\") = " + calc.add("Hi ", "Bye"));


        // ---------- RUNTIME POLYMORPHISM ----------
        System.out.println("\n===== Method Overriding (Runtime) =====");

        // A PARENT reference pointing to a CHILD object.
        // This is called UPCASTING.
        Shape shape1 = new Circle(5.0);       // Shape reference → Circle object
        Shape shape2 = new Rectangle(4.0, 6.0); // Shape reference → Rectangle object

        // Even though the reference type is 'Shape', the JVM calls
        // the CHILD's overridden version — decided at runtime.
        shape1.draw();    // "Drawing a Circle"
        shape2.draw();    // "Drawing a Rectangle"

        System.out.println("Circle area    = " + shape1.area());
        System.out.println("Rectangle area = " + shape2.area());


        // ---------- The real power: one loop, many forms ----------
        System.out.println("\n===== Polymorphism in action =====");

        // An array of Shape references holding different child objects
        Shape[] shapes = { new Circle(3.0), new Rectangle(2.0, 5.0), new Circle(1.0) };

        // The SAME line of code behaves differently for each object.
        // We don't need to know the exact type — that's the power.
        for (Shape s : shapes) {
            s.draw();
            System.out.println("Area = " + s.area());
            System.out.println("---");
        }
    }
}