import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BankOperationTest {
    BankOperations bank = new BankOperations();
    Account acc = new Account();
    Account account1 = new Account();
    Account account2 = new Account();

    @BeforeEach
    public void setup(){
         bank.createAccount(98765,"prema gumaste","savings",500);
         bank.createAccount(59876,"Chinnu","savings",500);
    }

    @Test
    public void testCreateAccount(){
        bank.createAccount(12345,"Chinmay","Current",500);
        Assertions.assertEquals(true,bank.isAccountPresent(12345));
    }

    @Test
    public void testFindAccount(){
        acc = bank.findAccount(98765);
        Assertions.assertEquals(true,bank.isAccountPresent(acc.accountNumber));
    }

    @Test
    public  void testTransferAmount(){
        bank.transferAmount(98765,59876,500);
        Assertions.assertEquals(0.0,bank.findAccount(98765).getAccountBalance());
        Assertions.assertEquals(1000.0,bank.findAccount(59876).getAccountBalance());
    }

    @Test
    public void testGetAccounts(){
        bank.getAccounts();
    }

}
