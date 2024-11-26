import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class UserAccountTest {

    private UserAccount account;

    @BeforeEach
    public void setUp() {
        // Create a UserAccount with valid credentials
        account = new UserAccount("admin", "12345");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/login_data.csv", numLinesToSkip = 1)
    public void testLoginWithCSV(String inputUser, String inputPass) {
        // Handle "null" as a String in CSV and convert to actual null
        String user = "null".equals(inputUser) ? null : inputUser;
        String pass = "null".equals(inputPass) ? null : inputPass;

        boolean result = account.validateCredentials(user, pass);

        // Expected result: should only pass when user is "admin" and pass is "12345"
        boolean expected = "admin".equals(user) && "12345".equals(pass);

        Assert.assertEquals(expected, result);
    }
}
