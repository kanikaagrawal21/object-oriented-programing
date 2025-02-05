package StaticsInstanceFinalKeywords;

class BankAccount {

    static String bankName = "National Bank";
    static int totalAccounts = 0;


    final int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }
    void displayAccount() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: $" + balance);
        }
    }
    static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(101, "Alice", 5000.0);
        BankAccount acc2 = new BankAccount(102, "Bob", 3000.0);

        acc1.displayAccount();
        System.out.println();
        acc2.displayAccount();
        System.out.println();

        BankAccount.getTotalAccounts();
    }
}

