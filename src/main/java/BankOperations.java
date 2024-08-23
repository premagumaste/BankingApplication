import java.util.ArrayList;
import java.util.List;

public class BankOperations {
    private static List<Account> accounts = new ArrayList<Account>();

    public void createAccount(Integer accNumber,String accHolderName, String accType,double amount){
        Account acc = new Account();
        if(this.isAccountPresent(accNumber)){
            System.out.println("Account is already present with this account Number please add different number");
        }else {
            Integer accNumb = acc.createAccount(accNumber, accHolderName, accType, amount);
            accounts.add(acc);
            System.out.println("Your " + accType + " is created and your account number is " + accNumb);
        }
    }

     public Account findAccount(Integer accNumber){
        for(Account acc: accounts){
            if(acc.getAccountNumber().equals(accNumber)){
                return acc;
            }
        }
         return null;
     }

    public void transferAmount(Integer fromAccount,Integer toAccount,double amount){
        Account from = this.findAccount(fromAccount);
        from.withdraw(fromAccount,amount);

        Account to = this.findAccount(toAccount);
        to.deposit(toAccount,amount);

        System.out.println(amount+" transfered from "+fromAccount+" to "+toAccount);

    }

    public void getAccounts() {
        for(Account acc: accounts){
            System.out.println("Account Number: "+acc.getAccountNumber());
            System.out.println("Account Holder Name: "+acc.getAccountHolderName());
            System.out.println("Account Type: "+acc.getAccountType());
            System.out.println("Account Balance: "+acc.getAccountBalance());
            System.out.println("-----------------------------");
        }
    }

    public boolean isAccountPresent(Integer accNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accNumber)) {
                return true; // Found the account, return true
            }
        }
        return false; // If no account was found, return false
    }

}
