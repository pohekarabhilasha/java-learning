public class IfElseDemo {

    public static void main(String[] args) {

        // =====================================================
        // CONTROL FLOW — IF / IF-ELSE /  IF - ELSE IF / NESTED IF /TERNARY
        // Used to make decisions in code based on conditions.
        // A condition must always evaluate to a BOOLEAN.
        // =====================================================


        // ---------- 1. SIMPLE IF ----------
        // Runs the block ONLY when the condition is true.

        int age = 20;

        if (age >= 18) {
            System.out.println("You are an adult.");
        }


        // ---------- 2. IF - ELSE ----------
        // Two-way decision: do A if true, else do B.

        int marks = 35;

        if (marks >= 40) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }


        // ---------- 3. IF - ELSE IF - ELSE (Ladder) ----------
        // Multiple conditions checked top to bottom.
        // The FIRST true condition runs, rest are skipped.

        int score = 75;

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else if (score >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }


        // ---------- 4. NESTED IF ----------
        // An if (or if-else) inside another if.
        // Use sparingly — too much nesting is hard to read.

        int salary = 50000;
        int experience = 3;

        if (salary > 30000) {
            if (experience >= 2) {
                System.out.println("Eligible for promotion");
            } else {
                System.out.println("Not enough experience");
            }
        } else {
            System.out.println("Salary too low for promotion");
        }


        // ---------- 5. TERNARY OPERATOR ----------
        // Shorthand for simple if-else.
        // Syntax:  condition ? valueIfTrue : valueIfFalse
        // Returns a value — useful inside variable assignments.

        int number = 7;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is: " + result);

        // Ternary can be nested but avoid it — gets unreadable fast.
        int n = 0;
        String sign = (n > 0) ? "Positive" : (n < 0) ? "Negative" : "Zero";
        System.out.println("Sign: " + sign);


        // ---------- 6. LOGICAL OPERATORS in CONDITIONS ----------
        // && (AND), || (OR), ! (NOT)
        // Used to combine multiple conditions.

        int hour = 14;
        boolean isWeekend = false;

        if (hour >= 9 && hour <= 17 && !isWeekend) {
            System.out.println("Office hours");
        } else {
            System.out.println("Outside office hours");
        }
    }
}