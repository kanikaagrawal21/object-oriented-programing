package ObjectRelationshipsAndCommunication;

import java.util.ArrayList;
import java.util.List;

class Bank{
    String name;
    ArrayList<Customer> customers;
    Bank(String name){
        this.name=name;
        this.customers=new ArrayList<>();
    }
    void openAccount(Customer customer,double initialBalance) {
        Account account = new Account(this, customer, initialBalance);
        customer.addAccount(account);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
    }
        public String getName() {
            return name;
        }

    }

class Customer{
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        for (Account acc : accounts) {
            System.out.println("Account at " + acc.getBank().getName() + ": Balance = $" + acc.getBalance());
        }
    }

    public String getName() {
        return name;
    }

}
class Account{
    private Bank bank;
    private Customer customer;
    private double balance;

    public Account(Bank bank, Customer customer, double balance) {
        this.bank = bank;
        this.customer = customer;
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }
}
public class BankAndAccountHolder {
    public static void main(String[] args) {
        Bank bank = new Bank("XYZ Bank");
        Customer customer = new Customer("Alice");

        bank.openAccount(customer, 1000.0);
        bank.openAccount(customer, 500.0);

        customer.viewBalance();
    }
}
