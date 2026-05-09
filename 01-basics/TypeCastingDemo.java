public class TypeCastingDemo {

    public static void main(String[] args) {

        // =====================================================
        // TYPE CASTING in Java
        // Converting a value from one data type to another.
        // =====================================================

        // ---------- 1. IMPLICIT CASTING (Widening) ----------
        // Smaller type → Larger type
        // Done AUTOMATICALLY by Java. No data loss.
        // Order: byte → short → int → long → float → double
        //                  char → int → long → float → double

        int   intValue    = 100;
        long  longValue   = intValue;       // int → long  (auto)
        float floatValue  = longValue;      // long → float (auto)
        double doubleValue = floatValue;    // float → double (auto)

        System.out.println("---- Implicit (Widening) ----");
        System.out.println("int:    " + intValue);
        System.out.println("long:   " + longValue);
        System.out.println("float:  " + floatValue);
        System.out.println("double: " + doubleValue);


        // ---------- 2. EXPLICIT CASTING (Narrowing) ----------
        // Larger type → Smaller type
        // Must be done MANUALLY using (type) syntax.
        // Risk: may lose data or precision.

        double d = 199.99;
        int    i = (int) d;       // double → int (manual cast)
                                  // decimal part is TRUNCATED, not rounded
                                  // 199.99 becomes 199

        long bigNumber = 130L;
        byte smallNumber = (byte) bigNumber;  // long → byte
                                              // byte range is -128 to 127
                                              // 130 overflows → becomes -126

        System.out.println("\n---- Explicit (Narrowing) ----");
        System.out.println("double 199.99 → int: " + i);
        System.out.println("long 130 → byte:    " + smallNumber);


        // ---------- 3. CHAR ↔ INT CASTING ----------
        // char internally stores a Unicode (numeric) value.

        char letter = 'A';
        int  ascii  = letter;          // implicit: char → int (gives 65)
        char fromAscii = (char) 66;    // explicit: int → char (gives 'B')

        System.out.println("\n---- char ↔ int ----");
        System.out.println("'A' as int:  " + ascii);
        System.out.println("66 as char:  " + fromAscii);


        // ---------- 4. STRING ↔ NUMBER CONVERSION ----------
        // NOT casting — these are method calls (parse / toString).
        // Casting only works between compatible primitive types
        // OR between related class references. String is a class,
        // so we use methods to convert.

        // String → int
        String numStr = "123";
        int parsed = Integer.parseInt(numStr);

        // int → String
        int num = 456;
        String str = String.valueOf(num);     // or  Integer.toString(num)

        System.out.println("\n---- String ↔ Number (using methods) ----");
        System.out.println("\"123\" → int + 1 = " + (parsed + 1));
        System.out.println("456   → String + \"!\" = " + str + "!");
    }
}