import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTest {
    private Account account;

    @BeforeEach
    public void setup(){
        account = new Account("prema gumaste",98765,"savings",500);
    }

    @Test
    public void testCreateAccount(){
        Account account2 = new Account();
        account2.createAccount(12345,"Chinmay","Current",500);

    }

    @Test
    public void testDeposit(){
        account.deposit(98765,500);
        Assertions.assertEquals(1000.0, account.getAccountBalance());
    }

    @Test
    public void testWithdraw(){
        account.withdraw(98765,500);
        Assertions.assertEquals(0.0, account.getAccountBalance());
    }

    @Test
    public void testCheckBalance(){
        account.checkBalance(98765);
        Assertions.assertEquals(500.0, account.getAccountBalance());
    }


}
