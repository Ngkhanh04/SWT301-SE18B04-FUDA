import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SampleTest {
    Sample s;

    @BeforeEach
    public void setUp() {
        s = new Sample();
    }

    @Test
    public void checkEven() {
        boolean kq = s.isEven(2);
        Assert.assertTrue(kq);
    }

    @Test
    public void checkPositiveNumber() {
        boolean kq = s.isEven(-5);
        Assert.assertEquals(false, kq);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 0, 10, 4, 16, Integer.MAX_VALUE - 1})
    void isOdd_ShouldReturnTrueForOddNumbers(int number) {
        boolean kq = s.isEven(number);
        Assert.assertEquals(true, kq);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/even.csv", numLinesToSkip = 1)
    public void checkEvenFromCSVFile(String input, String expected) {
        int number = Integer.parseInt(input); // Convert string to int
        boolean actual = s.isEven(number);
        boolean ex = Boolean.parseBoolean(expected);
        Assert.assertEquals(ex, actual);
    }
}
