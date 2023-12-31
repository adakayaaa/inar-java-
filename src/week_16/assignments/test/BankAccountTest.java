package week_16.assignments.test;

import org.junit.jupiter.api.*;
import week_16.assignments.main.BankAccount;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount bankAccount;

    @BeforeAll
    static void setUp() {
        System.out.println("OrderStatusManagerTest is started.");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("OrderStatusManagerTest is finished.");
    }

    @BeforeEach
    void testInfoStart() {
        System.out.println("Test started.");
        bankAccount = new BankAccount();
    }

    @AfterEach
    void testInfoFinish() {
        System.out.println("Test finished.");
    }

    @Test
    void bankAccountDepositIntoAccount() {
        double input = 200;
        bankAccount.deposit(input);
        double expected = input;
        double actual = bankAccount.getBalance();
        assertEquals(expected, actual, "TC_01 Test BankAccount Class for deposit into account\n" +
                "Rule:Deposit amount must be positive");

    }

    @Test
    void bankAccountWithDrawFromAccountWithSufficientFunds() {
        double depositIntoAccount = 200;
        bankAccount.deposit(depositIntoAccount);

        double input = 20;
        bankAccount.withdraw(input);
        double expected = depositIntoAccount - input;
        double actual = bankAccount.getBalance();

        assertEquals(expected, actual, "TC_02 Test BankAccount Class for withdraw from account with sufficient funds\n" +
                "Rule:The withdrawal amount has to greater than the balance");
    }

    @Test
    void bankAccountWithDrawFromAccountExceedingFunds() {
        double input = 220;
        System.out.println("TC_03 Test BankAccount Class for withdraw from account exceeding funds\n" +
                "Rule:The withdrawal amount has to greater than the balance.");
        assertThrows(IllegalArgumentException.class, () -> {
            bankAccount.withdraw(input);
        });
    }

    @Test
    void bankAccountDepositNegativeAmount() {
        double input = -220;
        System.out.println("TC_04 Test BankAccount Class for negative deposit amount \n" +
                "Rule:Withdrawal amount must be positive.");
        assertThrows(IllegalArgumentException.class, () -> {
            bankAccount.deposit(input);
        });
    }
    @Test
    void bankAccountWithDrawNegativeAmount() {
        double input = -220;
        System.out.println("TC_05 Test BankAccount Class for negative withdraw \n" +
                "Rule:The withdrawal amount has to be positive.");
        assertThrows(IllegalArgumentException.class, () -> {
            bankAccount.withdraw(input);
        });
    }


}













