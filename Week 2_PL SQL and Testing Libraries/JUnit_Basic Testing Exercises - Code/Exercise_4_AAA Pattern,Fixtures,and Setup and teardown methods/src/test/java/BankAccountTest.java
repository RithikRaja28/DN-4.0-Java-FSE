import org.example.BankAccount;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest {

    private BankAccount account;

    // Setup - runs before every test
    @Before
    public void setUp() {
        account = new BankAccount("Rithik", 1000.0);
        System.out.println("Setup complete");
    }

    // Teardown - runs after every test
    @After
    public void tearDown() {
        account = null;
        System.out.println("Teardown complete");
    }

    @Test
    public void testDeposit() {
        // Arrange
        double depositAmount = 500.0;

        // Act
        account.deposit(depositAmount);

        // Assert
        assertEquals(1500.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {
        // Arrange
        double withdrawAmount = 300.0;

        // Act
        account.withdraw(withdrawAmount);

        // Assert
        assertEquals(700.0, account.getBalance(), 0.001);
    }

    @Test
    public void testOverdraftNotAllowed() {
        // Arrange
        double withdrawAmount = 1500.0;

        // Act
        account.withdraw(withdrawAmount);

        // Assert
        assertEquals(1000.0, account.getBalance(), 0.001); // should not change
    }
}
