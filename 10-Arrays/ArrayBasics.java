import java.util.Arrays;

/**
 * Demonstrates 1D and 2D arrays in Java, using every key Arrays method:
 * toString, sort, copyOf, fill, equals.
 * Run: javac ArrayBasics.java && java ArrayBasics
 */
public class ArrayBasics {
    public static void main(String[] args) {

        // ---------- 1D ARRAY ----------
        // Fixed size, same type, contiguous memory, index starts at 0.
        int[] nums = {10, 20, 30, 40, 50};

        System.out.println("=== 1D ARRAY ===");
        System.out.println("First element: " + nums[0]);   // 10
        System.out.println("Length: " + nums.length);      // 5  (FIELD, no brackets)

        nums[2] = 99;                                       // update by index
        System.out.println("After update: " + Arrays.toString(nums));

        // iterate and sum
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println("Sum: " + sum);

        // Arrays.copyOf  -> make an independent copy
        int[] copy = Arrays.copyOf(nums, nums.length);

        // Arrays.sort    -> sorts in place
        Arrays.sort(copy);
        System.out.println("Sorted copy: " + Arrays.toString(copy));

        // Arrays.equals  -> compares contents (not references)
        System.out.println("nums equals copy? " + Arrays.equals(nums, copy));

        // Arrays.fill    -> set every element to one value
        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println("Filled with 7: " + Arrays.toString(filled));
        System.out.println();

        // ---------- 2D ARRAY ----------
        // An array of arrays: grid[row][col]
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("=== 2D ARRAY ===");
        System.out.println("Element [1][2]: " + grid[1][2]);    // 6
        System.out.println("Rows: " + grid.length);             // 2
        System.out.println("Cols in row 0: " + grid[0].length); // 3

        System.out.println("Full grid:");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        // Arrays.deepToString -> prints nested arrays nicely
        System.out.println("deepToString: " + Arrays.deepToString(grid));

        // jagged array: rows of different lengths
        int[][] jagged = new int[2][];
        jagged[0] = new int[]{1, 2};
        jagged[1] = new int[]{3, 4, 5};
        System.out.println("Jagged row 0 length: " + jagged[0].length); // 2
        System.out.println("Jagged row 1 length: " + jagged[1].length); // 3
    }
}
