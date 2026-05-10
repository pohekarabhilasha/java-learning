// =====================================================
// CONSTRUCTOR
//
// A special method used to INITIALIZE an object when it
// is created with the 'new' keyword.
//
// Rules:
//   1. Constructor name MUST match the class name
//   2. No return type — not even void
//   3. Called automatically when an object is created
//   4. Can be overloaded (multiple constructors with different parameters)
//
// If you don't write any constructor, Java provides a hidden
// DEFAULT CONSTRUCTOR with no parameters that does nothing.
// =====================================================


class Book {

    // Fields
    String title;
    String author;
    double price;


    // -------- 1. DEFAULT CONSTRUCTOR (no parameters) --------
    // Called when you write:  new Book();
    Book() {
        title  = "Unknown";
        author = "Unknown";
        price  = 0.0;
        System.out.println("Default constructor called");
    }


    // -------- 2. PARAMETERIZED CONSTRUCTOR --------
    // Called when you write:  new Book("Java", "James", 599.0);
    //
    // 'this' keyword refers to the CURRENT OBJECT.
    // We need it here because the parameter names are the same
    // as the field names. Without 'this', Java would think both
    // sides of '=' refer to the parameter.
    Book(String title, String author, double price) {
        this.title  = title;     // this.title  → field, title  → parameter
        this.author = author;
        this.price  = price;
        System.out.println("Parameterized constructor called");
    }


    // -------- 3. CONSTRUCTOR OVERLOADING --------
    // Multiple constructors with different parameter lists.
    // Java decides which one to call based on the arguments passed.
    Book(String title, String author) {
        // 'this(...)' calls another constructor of the SAME class.
        // It MUST be the first statement in the constructor.
        this(title, author, 0.0);
        System.out.println("Two-arg constructor called");
    }


    // Regular method to display book details
    void display() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
        System.out.println("---");
    }
}


public class ConstructorDemo {

    public static void main(String[] args) {

        // -------- Using the default constructor --------
        Book b1 = new Book();
        b1.display();


        // -------- Using the parameterized constructor --------
        Book b2 = new Book("Effective Java", "Joshua Bloch", 750.0);
        b2.display();


        // -------- Using the overloaded two-arg constructor --------
        Book b3 = new Book("Clean Code", "Robert Martin");
        b3.display();
    }
}