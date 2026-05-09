public class OperatorDemo {
		
	// An operator is a symbol that performs operations on variables and values.
	
	public static void main(String[] args) {
	int a = 10, b = 5;
	// Arithmetic
	System.out.println("Add: " + (a + b));
	// Relational
	System.out.println("Equal: " + (a == b));
	// Logical
	boolean x = true, y = false;
	System.out.println("AND: " + (x && y));
	// Bitwise
	System.out.println("Bitwise OR: " + (a | b));
	// Assignment
	a += 5;
	System.out.println("After += : " + a);
	// Unary
	int c = 3;
	System.out.println("++c: " + (++c));
	// Ternary
	int max = (a > b) ? a : b;
	System.out.println("Max: " + max);
	}
}