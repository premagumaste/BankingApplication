public class Account {
    String accountHolderName;
    Integer accountNumber;
    String accountType;
    double accountBalance;

    public Account(String accountHolderName, Integer accountNumber, String accountType, double accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public Account() {

    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Integer createAccount(Integer accNumber, String accHolderName, String accType,double amount){
        this.accountNumber = accNumber;
        this.accountHolderName = accHolderName;
        this.accountType = accType;
        this.accountBalance = amount;
        return  accNumber;
    }

    public void deposit(Integer accNumber, double amount){
        if(amount>0){
            accountBalance+= amount;
        }
        System.out.println(amount+" is deposit to your account and new balance is "+accountBalance);
    }

    public void withdraw(Integer accNumber, double amount){
        if(amount>accountBalance){
            System.out.println("Requested amount is greater than balance");
        }else{
            accountBalance-=amount;
            System.out.println(amount+" is withdraw from your account and new balance is "+accountBalance);
        }
    }

    public void checkBalance(Integer accNumber){
        System.out.println("your account balance is "+ this.accountBalance);
    }

}
