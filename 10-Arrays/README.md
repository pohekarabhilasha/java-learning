# Arrays in Java (1D, 2D, ArrayList)

Notes and runnable examples covering fixed-size arrays and the dynamic `ArrayList`, using all the core methods.

## Files

- `ArrayBasics.java` — 1D arrays, 2D arrays, jagged arrays, and `Arrays` utility methods
- `ArrayListDemo.java` — dynamic array operations, searching, sorting, autoboxing

## Run

```bash
javac ArrayBasics.java && java ArrayBasics
javac ArrayListDemo.java && java ArrayListDemo
```

## Concepts

### 1D array
A fixed-size container holding elements of the same type in contiguous memory, accessed by a zero-based index. Size is set at creation and cannot change. Access by index is O(1).

### 2D array
An array of arrays — a grid accessed as `grid[row][col]`. Rows can have different lengths (jagged arrays).

### ArrayList
A resizable array backed internally by a regular array that grows automatically as elements are added. Stores objects only, so primitives are autoboxed. Index access is O(1); inserting or removing in the middle is O(n) because elements shift.

## Counting elements — the common confusion

| Type | How to get the count |
|------|----------------------|
| Array | `.length` (field, no brackets) |
| ArrayList | `.size()` (method) |
| String | `.length()` (method) |

## Array vs ArrayList

|            | Array                 | ArrayList      |
|------------|-----------------------|----------------|
| Size       | Fixed                 | Dynamic        |
| Holds      | Primitives or objects | Objects only   |
| Count      | `.length`             | `.size()`      |
| Resize     | No                    | Yes (auto)     |

## Key methods used

**Array (via `Arrays` utility class):** `toString()`, `sort()`, `copyOf()`, `fill()`, `equals()`, `deepToString()`

**ArrayList:** `add()`, `get()`, `set()`, `remove()`, `size()`, `contains()`, `indexOf()`, `isEmpty()`, `addAll()`, `clear()`
