public class LoopsDemo {

    public static void main(String[] args) {

        // =====================================================
        // LOOPS in Java
        // Used to repeat a block of code multiple times.
        //
        // Java has 4 types of loops:
        //   1. for
        //   2. while
        //   3. do-while
        //   4. enhanced for-each (for arrays/collections)
        // =====================================================


        // ---------- 1. FOR LOOP ----------
        // Use when number of iterations is KNOWN in advance.
        // Syntax:  for (initialization; condition; update) { ... }
        //
        // Execution order:
        //   1) initialization (runs once)
        //   2) condition (checked before each iteration)
        //   3) body
        //   4) update (after each iteration)
        //   5) go back to step 2

        System.out.println("---- for loop ----");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }


        // ---------- 2. WHILE LOOP ----------
        // Use when number of iterations is UNKNOWN —
        // depends on a condition.
        // Condition is checked BEFORE the body runs.
        // If condition is false on first check, body never runs.

        System.out.println("\n---- while loop ----");
        int n = 1;
        while (n <= 3) {
            System.out.println("n = " + n);
            n++;     // IMPORTANT: update inside body, else infinite loop
        }


        // ---------- 3. DO-WHILE LOOP ----------
        // Body runs FIRST, then condition is checked.
        // So body runs AT LEAST ONCE, even if condition is false.
        // Note the semicolon after while(...);

        System.out.println("\n---- do-while loop ----");
        int count = 10;
        do {
            System.out.println("count = " + count);
            count++;
        } while (count < 10);   // false on first check, but body ran once


        // ---------- 4. ENHANCED FOR-EACH LOOP ----------
        // Cleaner syntax for arrays/collections.
        // No index — gives each element directly.
        // Cannot modify the array elements through the loop variable.

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("\n---- for-each loop ----");
        for (int num : numbers) {
            System.out.println("num = " + num);
        }


        // ---------- 5. BREAK ----------
        // Exits the loop IMMEDIATELY, no matter the condition.

        System.out.println("\n---- break ----");
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                break;     // stops the loop when i is 4
            }
            System.out.println("i = " + i);
        }


        // ---------- 6. CONTINUE ----------
        // Skips the CURRENT iteration and moves to the next one.
        // Loop continues running.

        System.out.println("\n---- continue (skip even numbers) ----");
        for (int i = 1; i <= 6; i++) {
            if (i % 2 == 0) {
                continue;     // skip even numbers
            }
            System.out.println("i = " + i);
        }


        // ---------- 7. NESTED LOOP ----------
        // A loop inside another loop.
        // Common for 2D structures, patterns, multiplication tables.

        System.out.println("\n---- nested loop (3x3 grid) ----");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();   // new line after inner loop
        }


        // ---------- 8. INFINITE LOOP (just be aware) ----------
        // Happens if condition never becomes false.
        // Stop execution with break or fix the update.
        //
        // Example (commented to avoid hanging):
        //
        // while (true) {
        //     System.out.println("forever");
        // }
    }
}