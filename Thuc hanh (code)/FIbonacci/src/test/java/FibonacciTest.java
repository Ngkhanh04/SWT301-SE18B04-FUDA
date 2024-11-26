import org.junit.Test;
import static org.junit.Assert.*;
import com..Fibonacci;

public class FibonacciTest {

    @Test
    public void testGenerateFibonacci() {
        // Test case 1: Regular case (n = 5)
        int[] expected1 = {0, 1, 1, 2, 3};
        assertArrayEquals(expected1, Fibonacci.generateFibonacci(5));

        // Test case 2: Single element (n = 1)
        int[] expected2 = {0};
        assertArrayEquals(expected2, Fibonacci.generateFibonacci(1));

        // Test case 3: Two elements (n = 2)
        int[] expected3 = {0, 1};
        assertArrayEquals(expected3, Fibonacci.generateFibonacci(2));

        // Test case 4: Zero elements (n = 0)
        int[] expected4 = {};
        assertArrayEquals(expected4, Fibonacci.generateFibonacci(0));

        // Test case 5: Large input (n = 10)
        int[] expected5 = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        assertArrayEquals(expected5, Fibonacci.generateFibonacci(10));

        // Test case 6: Negative input (n = -5, expecting empty array)
        int[] expected6 = {};
        assertArrayEquals(expected6, Fibonacci.generateFibonacci(-5));
    }
}
