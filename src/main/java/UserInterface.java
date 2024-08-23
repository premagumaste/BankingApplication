import java.util.Scanner;

public class UserInterface {
    public static void main(String args[]) {
        BankOperations bankOps = new BankOperations();
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Banking System");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Show All Accounts");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    Integer accNumber = Integer.valueOf(scanner.nextLine());
                    System.out.print("Enter account holder name: ");
                    String accHolder = scanner.nextLine();
                    System.out.print("Enter account type (e.g., Savings/Current): ");
                    String accType = scanner.nextLine();
                    System.out.print("Enter initial deposit: ");
                    double amount = Double.parseDouble(scanner.nextLine());
                    bankOps.createAccount(accNumber, accHolder, accType,amount);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accNumber = Integer.valueOf(scanner.nextLine());
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(accNumber, depositAmount);
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accNumber = Integer.valueOf(scanner.nextLine());
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(accNumber, withdrawAmount);
                    break;
                case 4:
                    System.out.print("Enter from account number: ");
                    Integer fromAcc = Integer.valueOf(scanner.nextLine());
                    System.out.print("Enter to account number: ");
                    Integer toAcc = Integer.valueOf(scanner.nextLine());
                    System.out.print("Enter transfer amount: ");
                    double transferAmount = scanner.nextDouble();
                    bankOps.transferAmount(fromAcc, toAcc, transferAmount);
                    break;
                case 5:
                    bankOps.getAccounts();
                    break;
                case 6:
                    System.out.println("Thank you for using the Banking System.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }
    }
}