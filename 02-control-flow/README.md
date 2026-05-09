# 02 — Control Flow

Statements that control the order in which code runs — making decisions and repeating actions.

## What's in this folder

- `IfElseDemo.java` — `if`, `else if`, `else`, nested if, ternary operator
- `SwitchDemo.java` — classic switch, fall-through, switch expression (Java 14+)
- `LoopsDemo.java` — `for`, `while`, `do-while`, for-each, `break`, `continue`, nested loops

## Concepts covered

### Decision-making (Conditional statements)

- **if** — runs block when condition is true
- **if-else** — two-way decision
- **if-else if-else (ladder)** — multiple conditions, first match wins
- **nested if** — if inside another if
- **ternary** — `condition ? valueIfTrue : valueIfFalse` (returns a value)

### Switch

- Classic `switch` with `case` and `break`
- **Fall-through** — what happens when `break` is missing
- Allowed types: `byte`, `short`, `int`, `char`, `String`, `enum`, wrapper classes
- Not allowed: `long`, `float`, `double`, `boolean`
- **Switch expression (Java 14+)** — arrow syntax, no `break`, returns a value, supports `yield`

### Loops

| Loop | When to use | Body runs at least once? |
|------|-------------|--------------------------|
| `for` | Number of iterations is known | Maybe (0 or more) |
| `while` | Iterations depend on a condition | Maybe (0 or more) |
| `do-while` | Need to run body at least once | Yes |
| `for-each` | Iterating arrays/collections | Maybe (0 or more) |

### Loop control

- **break** — exits the loop immediately
- **continue** — skips current iteration, goes to next
- **return** — exits the entire method

## Common interview questions

1. **Difference between `while` and `do-while`?**
   → `while` checks condition first — body may not run at all.
   → `do-while` runs body first — body always runs at least once.

2. **Difference between `for` and `for-each`?**
   → `for` gives you the index, full control. `for-each` gives the element directly, cleaner but no index, can't modify the array structure.

3. **Difference between `break` and `continue`?**
   → `break` exits the loop. `continue` skips to the next iteration.

4. **Which types are allowed in `switch`?**
   → byte, short, int, char, String (Java 7+), enum, wrapper classes. NOT long, float, double, boolean.

5. **What is fall-through in switch?**
   → When a case has no `break`, execution continues into the next case. Dangerous unless intentional.

## How to run

In Eclipse: right-click any `.java` file → **Run As → Java Application**

In terminal:
```bash
javac IfElseDemo.java
java IfElseDemo
```