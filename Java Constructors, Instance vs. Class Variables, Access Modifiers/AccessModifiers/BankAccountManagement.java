package AccessModifiers;

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    // Constructor
    SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    void displaySavingsAccount() {
        System.out.println("Savings Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

// Main class
public class BankAccountManagement {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(101, "Alice", 1000.0);
        acc1.displayAccount();

        acc1.deposit(500.0);
        System.out.println("Updated Balance: $" + acc1.getBalance());

        acc1.withdraw(300.0);
        System.out.println("Updated Balance: $" + acc1.getBalance());

        SavingsAccount sav1 = new SavingsAccount(202, "Bob", 1500.0);
        sav1.displaySavingsAccount();
    }
}

