public class VariablesDemo {

    // ===== INSTANCE VARIABLE =====
    // Declared inside the class but OUTSIDE any method.
    // Belongs to each object (instance) of the class.
    // Each new object gets its own copy.
    // Default value if not initialized: 0 / null / false
    String name = "Abhilasha";
    int age = 25;

    // ===== STATIC VARIABLE (Class Variable) =====
    // Declared with the 'static' keyword.
    // Belongs to the CLASS, not to any individual object.
    // Only ONE copy exists, shared across all objects.
    // Memory is allocated once when the class is loaded.
    static String company = "Infosys";
    static int count = 0;

    // A method to demonstrate local variables
    public void showDetails() {

        // ===== LOCAL VARIABLE =====
        // Declared INSIDE a method, constructor, or block.
        // Exists only while the method runs — destroyed after.
        // Has NO default value — must be initialized before use.
        // Cannot be accessed outside this method.
    	// Local variables can only use final as a modifier.
        String role = "Software Engineer";   // local variable
        int experience = 2;                  // local variable

        System.out.println("Name: " + name);             // instance variable
        System.out.println("Age: " + age);               // instance variable
        System.out.println("Company: " + company);       // static variable
        System.out.println("Role: " + role);             // local variable
        System.out.println("Experience: " + experience); // local variable
        System.out.println("---");
    }

    public static void main(String[] args) {

        // Create two objects to see how instance vs static behave
        VariablesDemo emp1 = new VariablesDemo();
        emp1.showDetails();

        VariablesDemo emp2 = new VariablesDemo();
        emp2.name = "Riya";       // changing instance variable for emp2 only
        emp2.age = 28;
        emp2.showDetails();

        // Notice: 'company' is the same for both because it's static
        // If we change it once, it changes for everyone
        VariablesDemo.company = "TCS";

        System.out.println("After changing company:");
        emp1.showDetails();
        emp2.showDetails();

        // Static variables are accessed via the class name (best practice)
        // because they don't belong to any specific object.
    }
}