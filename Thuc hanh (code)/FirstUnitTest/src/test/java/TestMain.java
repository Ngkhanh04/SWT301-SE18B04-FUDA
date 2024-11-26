import Fptu.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestMain {

    @Test
    public void checkEven() {
        Main s = new Main();
        boolean kq = s.isEven(2);
        Assertions.assertTrue(kq, "Số 2 phải là số chẵn");
    }

    @Test
    public void checkOdd() {
        Main s = new Main();
        boolean kq = s.isEven(-5);
        Assertions.assertFalse(kq, "Số -5 phải là số lẻ");
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 0, 10, -4, 16})
    public void isEven_ShouldReturnTrueForEvenNumbers(int number) {
        Main s = new Main();
        boolean kq = s.isEven(number);
        Assertions.assertTrue(kq, number + " phải là số chẵn");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -1, -7})
    public void isEven_ShouldReturnFalseForOddNumbers(int number) {
        Main s = new Main();
        boolean kq = s.isEven(number);
        Assertions.assertFalse(kq, number + " phải là số lẻ");
    }
}
