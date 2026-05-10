import java.util.Scanner;   // Scanner is in java.util package — must import it

public class ScannerDemo {

    public static void main(String[] args) {

        // =====================================================
        // SCANNER — Reading input from the user (keyboard)
        //
        // Scanner is a class in java.util used to read input from:
        //   - Keyboard (System.in)
        //   - Files
        //   - Strings
        //
        // We pass System.in to the constructor to read from keyboard.
        // =====================================================

        // Create a Scanner object connected to System.in
        Scanner sc = new Scanner(System.in);


        // ---------- 1. Reading a STRING (single word) ----------
        System.out.print("Enter your first name: ");
        String firstName = sc.next();   // reads until first whitespace


        // ---------- 2. Reading an INTEGER ----------
        System.out.print("Enter your age: ");
        int age = sc.nextInt();


        // ---------- 3. Reading a DOUBLE (decimal) ----------
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();


        // ---------- 4. Reading a BOOLEAN ----------
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();


        // ---------- 5. Reading a FULL LINE (with spaces) ----------
        // IMPORTANT: nextInt(), nextDouble(), nextBoolean() etc. do NOT
        // consume the newline ('\n') after your input. So if you call
        // nextLine() right after, it reads the leftover newline as
        // an empty string. Fix it by calling sc.nextLine() once
        // to "eat" the newline before reading the next line.

        sc.nextLine();   // consume the leftover newline

        System.out.print("Enter your full address (with spaces): ");
        String address = sc.nextLine();   // reads the full line including spaces


        // ---------- 6. Reading a CHARACTER ----------
        // Scanner has no nextChar() method.
        // Trick: read a string and take its first character.
        System.out.print("Enter your grade (A-F): ");
        char grade = sc.next().charAt(0);


        // ---------- DISPLAY ALL ----------
        System.out.println("\n========== Your Details ==========");
        System.out.println("First Name : " + firstName);
        System.out.println("Age        : " + age);
        System.out.println("Salary     : " + salary);
        System.out.println("Is Student : " + isStudent);
        System.out.println("Address    : " + address);
        System.out.println("Grade      : " + grade);


        // ---------- ALWAYS CLOSE THE SCANNER ----------
        // Frees up system resources. Best practice.
        sc.close();
    }
}