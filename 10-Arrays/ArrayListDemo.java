import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Demonstrates ArrayList (dynamic / resizable array) using every key method:
 * add, get, set, remove, size, contains, indexOf, isEmpty, addAll, clear.
 * Run: javac ArrayListDemo.java && java ArrayListDemo
 */
public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        // add -> append elements (grows automatically)
        names.add("Abhilasha");
        names.add("Bob");
        names.add("Carol");

        System.out.println("=== ARRAYLIST ===");
        System.out.println("First (get): " + names.get(0));   // Abhilasha
        System.out.println("Size: " + names.size());          // 3  (METHOD, not a field)

        // set -> update by index
        names.set(1, "Bobby");

        // add(index, value) -> insert, shifts the rest right
        names.add(1, "Dave");
        System.out.println("After insert: " + names);

        // addAll -> append a whole collection at once
        names.addAll(Arrays.asList("Eve", "Frank"));
        System.out.println("After addAll: " + names);

        // remove by value, then by index
        names.remove("Carol");   // by value
        names.remove(0);         // by index (removes Abhilasha)
        System.out.println("After removes: " + names);

        // contains / indexOf -> search
        System.out.println("Contains Dave? " + names.contains("Dave"));
        System.out.println("Index of Bobby: " + names.indexOf("Bobby"));

        // iterate
        System.out.println("Iterating:");
        for (String name : names) {
            System.out.println("  " + name);
        }

        // sort
        Collections.sort(names);
        System.out.println("Sorted: " + names);

        System.out.println("Is empty? " + names.isEmpty());  // false

        // clear -> remove everything
        names.clear();
        System.out.println("After clear: " + names);
        System.out.println("Is empty now? " + names.isEmpty()); // true
        System.out.println();

        // ---------- autoboxing note ----------
        // ArrayList holds objects only, so int is autoboxed to Integer.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);   // int 10 -> Integer.valueOf(10) automatically
        numbers.add(20);
        int first = numbers.get(0);  // auto-unboxed back to int
        System.out.println("Autoboxed first: " + first);
    }
}
