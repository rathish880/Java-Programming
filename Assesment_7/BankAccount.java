package Assesment_7;

abstract class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
           // System.out.println(amount + " deposited into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            //System.out.println(amount + " withdrawn from account " + accountNumber);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}
