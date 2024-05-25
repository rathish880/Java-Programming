package Assesment_7;

public class Main {
    public static void main(String[] args) {
        
        BankAccount savingsAccount = new SavingsAccount("1234567890", "John Doe");
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(500);
        System.out.println(savingsAccount.getBalance()); 

        
        BankAccount currentAccount = new CurrentAccount("9876543210", "Jane Smith");
        currentAccount.deposit(1000);
        currentAccount.withdraw(1500);
        System.out.println(currentAccount.getBalance()); 
    }
}
