public class DataTypesDemo {

    public static void main(String[] args) {

        // =====================================================
        // DATA TYPES IN JAVA
        // =====================================================
        // Java is a STRONGLY TYPED language — every variable
        // must have a declared type before use.
        //
        // Two main categories:
        //   1. Primitive       (8 built-in types)
        //   2. Non-Primitive   (also called Reference types)
        // =====================================================


        // ============== 1. PRIMITIVE DATA TYPES ==============
        // Store actual values. Fixed size. 
    	// Stored in stack memory.
        // 8 types grouped into 4 categories:


        // ----- (a) Integer types: whole numbers -----

        byte  b = 100;               // 1 byte  | range: -128 to 127
        short s = 30000;             // 2 bytes | range: -32,768 to 32,767
        int   i = 100000;            // 4 bytes | most commonly used
        long  l = 9999999999L;       // 8 bytes | needs 'L' suffix

        System.out.println("---- Integer types ----");
        System.out.println("byte:  " + b);
        System.out.println("short: " + s);
        System.out.println("int:   " + i);
        System.out.println("long:  " + l);


        // ----- (b) Floating-point types: decimal numbers -----

        float  f = 3.14f;            // 4 bytes | needs 'f' suffix | ~7 digit precision
        double d = 199.9999;         // 8 bytes | default for decimals | ~15 digit precision

        System.out.println("\n---- Floating-point types ----");
        System.out.println("float:  " + f);
        System.out.println("double: " + d);


        // ----- (c) Character type: a single character -----

        char ch = 'A';               // 2 bytes | uses single quotes | stores Unicode value

        System.out.println("\n---- Character type ----");
        System.out.println("char: " + ch);
        System.out.println("Unicode value of 'A': " + (int) ch);  // prints 65


        // ----- (d) Boolean type: true or false -----

        boolean isJavaFun = true;    // size not precisely defined | only 'true' or 'false'

        System.out.println("\n---- Boolean type ----");
        System.out.println("boolean: " + isJavaFun);


        // ============== 2. NON-PRIMITIVE DATA TYPES ==============
        // Also called REFERENCE types.
        // Store references (memory addresses) to objects, not actual values.
        // Stored in heap memory.
        // Examples: String, Arrays, Classes, Interfaces.

        // ----- String -----
        // String is a class in java.lang package.
        // Uses double quotes.
        String name = "Abhilasha";

        // ----- Array -----
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("\n---- Non-primitive types ----");
        System.out.println("String name: " + name);
        System.out.println("First number in array: " + numbers[0]);
        System.out.println("Array length: " + numbers.length);


        // ============== DEFAULT VALUES ==============
        // Primitives → default values (0, 0.0, false, '\u0000')
        // Non-primitives → default value is null
        // (Defaults apply only to instance/static variables, NOT local ones.)
    }
}