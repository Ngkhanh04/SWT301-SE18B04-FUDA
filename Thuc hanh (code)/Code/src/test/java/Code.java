package java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Code {

    // Define the method getSumArray in the Code class
    public int[] getSumArray(int[] ar) {
        int[] result = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += ar[j];
            }
            result[i] = sum;
        }
        return result;
    }
}

class ArraySumTest {

    @Test
    void testGetSumArray() {
        Code code = new Code();  // Create an instance of the Code class

        // Test case 1: Regular case
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 3, 6, 10};
        assertArrayEquals(expected, code.getSumArray(input));

        // Test case 2: Single element array
        int[] singleElement = {5};
        int[] expectedSingle = {5};
        assertArrayEquals(expectedSingle, code.getSumArray(singleElement));

        // Test case 3: Empty array
        int[] emptyArray = {};
        int[] expectedEmpty = {};
        assertArrayEquals(expectedEmpty, code.getSumArray(emptyArray));

        // Test case 4: Negative numbers
        int[] negativeArray = {-1, -2, -3};
        int[] expectedNegative = {-1, -3, -6};
        assertArrayEquals(expectedNegative, code.getSumArray(negativeArray));
    }
}
