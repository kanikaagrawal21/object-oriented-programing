package HierarchicalInheritance;

class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account, Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account, Withdrawal Limit: $" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int term;

    FixedDepositAccount(String accountNumber, double balance, int term) {
        super(accountNumber, balance);
        this.term = term;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account, Term: " + term + " months");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 5000, 3.5);
        CheckingAccount checking = new CheckingAccount("CA456", 2000, 1000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD789", 10000, 12);

        savings.displayAccountDetails();
        savings.displayAccountType();

        checking.displayAccountDetails();
        checking.displayAccountType();

        fixedDeposit.displayAccountDetails();
        fixedDeposit.displayAccountType();
    }
}
