# 03 — Input / Output with Scanner

How to take input from the user (keyboard) using the `Scanner` class.

## What's in this folder

- `ScannerDemo.java` — reading String, int, double, boolean, full line, and char from user input

## Concepts covered

### Scanner basics
- `Scanner` is in the `java.util` package (must be imported)
- `Scanner sc = new Scanner(System.in);` connects it to the keyboard
- Always call `sc.close();` when done

### Common methods

| Method | Reads |
|--------|-------|
| `next()` | A single word (until whitespace) |
| `nextLine()` | A whole line (until Enter) |
| `nextInt()` | Integer |
| `nextDouble()` | Decimal |
| `nextBoolean()` | true/false |

There is **no** `nextChar()`. Use `sc.next().charAt(0)` instead.

### The classic newline trap

After `nextInt()` (or any `nextX()` except `nextLine()`), a stray `\n` is left in the buffer.
A following `nextLine()` will read that `\n` as an empty line.

**Fix:** call `sc.nextLine();` once between them to consume the leftover newline.

## Common interview questions

1. **Which package is Scanner in?** → `java.util`
2. **Difference between `next()` and `nextLine()`?** → `next()` reads one word; `nextLine()` reads the entire line including spaces.
3. **Why should you close the Scanner?** → To release the underlying input stream.
4. **Why does `nextLine()` after `nextInt()` read an empty string?** → Because `nextInt()` leaves the newline character in the buffer.