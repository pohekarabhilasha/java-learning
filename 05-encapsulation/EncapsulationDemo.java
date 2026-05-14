// =====================================================
// ENCAPSULATION — the first pillar of OOP
//
// Encapsulation = wrapping DATA (fields) and the CODE that
// operates on it (methods) together into a single unit (class),
// AND hiding the internal data from outside access.
//
// Achieved in Java by:
//   1. Making fields 'private'  → no direct access from outside
//   2. Providing public 'getter' and 'setter' methods → controlled access
//
// Benefits:
//   - Data hiding (internal details are protected)
//   - Control over data (validation inside setters)
//   - Flexibility (change internals without breaking outside code)
//   - Easier to maintain and debug
// =====================================================


class BankAccount {

    // -------- PRIVATE FIELDS --------
    // 'private' means these can ONLY be accessed inside this class.
    // Outside code CANNOT do:  account.balance = -5000;  ← compile error
    private String accountHolder;
    private double balance;


    // -------- CONSTRUCTOR --------
    BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;

        // Even in the constructor, we can validate
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance can't be negative. Set to 0.");
        }
    }


    // -------- GETTER methods (read access) --------
    // Naming convention: get + FieldName
    // They simply return the private field's value.
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }


    // -------- SETTER methods (write access with control) --------
    // Naming convention: set + FieldName
    // This is where encapsulation shows its power — we can
    // VALIDATE the data before allowing it to be changed.

    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.isEmpty()) {
            this.accountHolder = accountHolder;
        } else {
            System.out.println("Invalid name. Not updated.");
        }
    }

    // Notice: there's NO setBalance() method.
    // We don't want anyone directly setting the balance.
    // Instead, we expose controlled BEHAVIOR — deposit and withdraw.

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}


public class EncapsulationDemo {

    public static void main(String[] args) {

        // Create a bank account object
        BankAccount account = new BankAccount("Abhilasha", 5000.0);

        // -------- Reading data via GETTERS --------
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("---");

        // -------- We CANNOT do this (fields are private) --------
        // account.balance = 999999;     // ❌ compile error
        // account.accountHolder = "X";  // ❌ compile error

        // -------- Modifying data via controlled methods --------
        account.deposit(2000.0);
        account.withdraw(1000.0);
        account.withdraw(50000.0);    // blocked — insufficient balance
        account.deposit(-500.0);      // blocked — invalid amount

        System.out.println("---");
        System.out.println("Final Balance: " + account.getBalance());
        System.out.println("---");

        // -------- Updating name via SETTER with validation --------
        account.setAccountHolder("");          // blocked — invalid
        account.setAccountHolder("Riya");      // allowed
        System.out.println("Updated Account Holder: " + account.getAccountHolder());
    }
}