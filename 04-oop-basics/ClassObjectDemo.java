// =====================================================
// CLASS — a blueprint for creating objects
//
// A class defines:
//   - Fields (data / properties / instance variables)
//   - Methods (behavior / actions)
//
// No memory is allocated for fields when a class is defined.
// Memory is allocated only when an OBJECT is created from it.
// =====================================================


// ---------- Define a Student class ----------
// One file can have multiple classes, but only ONE can be public,
// and the public class must match the file name.
class Student {

    // Fields (instance variables) — each Student object has its own copy
    String name;
    int    rollNumber;
    double marks;

    // Method — defines behavior
    void displayDetails() {
        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Marks       : " + marks);
        System.out.println("---");
    }

    // Another method — accepts a parameter
    void updateMarks(double newMarks) {
        marks = newMarks;
    }
}


// ---------- The class with main method ----------
public class ClassObjectDemo {

    public static void main(String[] args) {

        // -------- Creating OBJECTS --------
        // Syntax:  ClassName variableName = new ClassName();
        //
        // 'new Student()' allocates memory in the HEAP for a new object
        // and returns a reference. We store that reference in 'student1'.

        Student student1 = new Student();

        // Setting field values using the dot operator
        student1.name = "Abhilasha";
        student1.rollNumber = 101;
        student1.marks = 88.5;

        // Calling a method on the object
        student1.displayDetails();


        // -------- Create another object --------
        // Each object has its OWN copy of the fields.
        Student student2 = new Student();
        student2.name = "Riya";
        student2.rollNumber = 102;
        student2.marks = 91.0;

        student2.displayDetails();


        // -------- Modify object state via method --------
        student1.updateMarks(95.0);
        System.out.println("After updating student1's marks:");
        student1.displayDetails();


        // -------- Default values for fields --------
        // If you don't initialize fields, they get default values:
        //   numeric   → 0 / 0.0
        //   boolean   → false
        //   reference → null
        Student empty = new Student();
        System.out.println("Default field values for an uninitialized Student:");
        empty.displayDetails();   // name=null, rollNumber=0, marks=0.0
    }
}