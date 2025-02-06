package LevelTwo;
class BankAccount{
    private String accountHolder;
    private double accountNumber;
    private int balance;

    public void account(){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public int WithdrawaingMoney(int amount){
        if(balance>amount){
            System.out.println("amount");
        }
        return amount;
    }
    public int depositMoney(int amount){
        return balance+amount;
    }
    public int display(){
        return balance;
    }

}
public class ATMSimulator {
    public static void main(String[] args) {
        BankAccount b= new BankAccount();
        b.WithdrawaingMoney(2000);
        b.depositMoney(200);
        b.display();

    }
}
