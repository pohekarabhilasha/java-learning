public class SwitchDemo {

    public static void main(String[] args) {

        // =====================================================
        // SWITCH STATEMENT
        // Used when you have ONE variable to compare against
        // many possible values. Cleaner than long if-else-if.
        //
        // Allowed types for switch variable:
        // byte, short, int, char, String, enum, wrapper classes
        // NOT allowed: long, float, double, boolean
        // =====================================================


        // ---------- 1. CLASSIC SWITCH STATEMENT ----------
        // Each 'case' must end with 'break' to stop execution.
        // 'default' runs if no case matches (optional but good practice).

        int day = 6;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
            case 7:
                // Multiple cases can share the same code (no break in case 6)
                dayName = "Weekend";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("Day " + day + " is: " + dayName);


        // ---------- 2. FALL-THROUGH (when 'break' is missing) ----------
        // Without 'break', execution continues into the next case.
        // Sometimes useful (case 6/7 above), but usually a bug.

        int x = 1;
        System.out.println("\n---- Fall-through example ----");
        switch (x) {
            case 1:
                System.out.println("One");
                // no break — falls into case 2
            case 2:
                System.out.println("Two");
                // no break — falls into case 3
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Other");
        }


        // ---------- 3. SWITCH WITH STRING (Java 7+) ----------
        // Strings can be used as switch variable since Java 7.
        // Comparison is CASE-SENSITIVE.

        String role = "ADMIN";
        System.out.println("\n---- Switch with String ----");
        switch (role) {
            case "ADMIN":
                System.out.println("Full access");
                break;
            case "USER":
                System.out.println("Limited access");
                break;
            case "GUEST":
                System.out.println("Read-only access");
                break;
            default:
                System.out.println("No access");
        }


        // ---------- 4. SWITCH EXPRESSION (Java 14+) ----------
        // Modern, cleaner syntax using '->' (arrow).
        // No 'break' needed — automatic, no fall-through.
        // Returns a value — can be assigned directly.
        // Use comma to group multiple values in one case.

        int month = 4;
        String season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Invalid month";
        };
        System.out.println("\nMonth " + month + " is in: " + season);


        // ---------- 5. SWITCH EXPRESSION WITH BLOCK ----------
        // For multi-line logic in a case, use { } and 'yield' to return.

        int marks = 75;
        String grade = switch (marks / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> {
                System.out.println("Good performance!");
                yield "C";   // 'yield' returns a value from a block
            }
            case 6 -> "D";
            default -> "F";
        };
        System.out.println("Marks " + marks + " → Grade: " + grade);
    }
}