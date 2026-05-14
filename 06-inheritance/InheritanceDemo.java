// =====================================================
// INHERITANCE — the second pillar of OOP
//
// Inheritance lets one class (CHILD / SUBCLASS) acquire the
// fields and methods of another class (PARENT / SUPERCLASS).
//
// Keyword:  extends
//   class Child extends Parent { ... }
//
// Represents an "IS-A" relationship.
//   A Dog IS-A Animal.  A Car IS-A Vehicle.
//
// Benefits:
//   - Code reusability (no need to rewrite common code)
//   - Method overriding (child can change parent's behavior)
//   - Establishes a natural hierarchy
// =====================================================


// ---------- PARENT CLASS (Superclass / Base class) ----------
class Animal {

    String name;

    // Parent constructor
    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }

    void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}


// ---------- CHILD CLASS (Subclass / Derived class) ----------
// Dog inherits everything from Animal using 'extends'.
class Dog extends Animal {

    String breed;

    // Child constructor
    Dog(String name, String breed) {

        // 'super(...)' calls the PARENT's constructor.
        // It MUST be the first statement in the child constructor.
        // If you don't write it, Java inserts a hidden super()
        // (calling the parent's no-arg constructor).
        super(name);

        this.breed = breed;
        System.out.println("Dog constructor called");
    }

    // -------- METHOD OVERRIDING --------
    // Child provides its OWN version of a parent method.
    // Same method name, same parameters, same return type.
    // @Override annotation is optional but recommended —
    // it makes the compiler check that you're actually overriding.
    @Override
    void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }

    // -------- Child's OWN method --------
    void fetch() {
        System.out.println(name + " is fetching the ball.");
    }

    // -------- Using 'super' to access PARENT's version --------
    void showBothSounds() {
        super.makeSound();   // calls Animal's makeSound()
        makeSound();         // calls Dog's overridden makeSound()
    }
}


// ---------- Another CHILD CLASS ----------
class Cat extends Animal {

    Cat(String name) {
        super(name);
        System.out.println("Cat constructor called");
    }

    @Override
    void makeSound() {
        System.out.println(name + " meows: Meow!");
    }
}


public class InheritanceDemo {

    public static void main(String[] args) {

        System.out.println("===== Creating a Dog =====");
        Dog dog = new Dog("Bruno", "Labrador");

        // Dog can use INHERITED methods from Animal
        dog.eat();        // inherited from Animal
        dog.sleep();      // inherited from Animal

        // Dog uses its OVERRIDDEN method
        dog.makeSound();  // Dog's version — barks

        // Dog uses its OWN method
        dog.fetch();

        // Access inherited field
        System.out.println("Breed: " + dog.breed);

        System.out.println("\n===== super demo =====");
        dog.showBothSounds();   // shows parent's + child's version


        System.out.println("\n===== Creating a Cat =====");
        Cat cat = new Cat("Whiskers");
        cat.eat();         // inherited
        cat.makeSound();   // overridden — meows


        // -------- KEY POINT: constructor call order --------
        // When a child object is created, the PARENT constructor
        // runs FIRST, then the child constructor.
        // That's why "Animal constructor called" prints before
        // "Dog constructor called".
    }
}