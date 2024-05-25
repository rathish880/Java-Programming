package Assesment_6;

public class BankOperationsManager {
    private static BankOperationsManager instance;

    private BankOperationsManager() {
  
    } 
    public static BankOperationsManager getInstance() {
        if (instance == null) {
            instance = new BankOperationsManager();
        }
        return instance;
    }
    public void openNewAccount(String accountHolderName, String accountType) {
      
        System.out.println("New account opened for " + accountHolderName + " with account type " + accountType);
    }

    public void closeAccount(String accountNumber) {
     
        System.out.println("Account with account number " + accountNumber + " closed");
    }

    
    public void deposit(String accountNumber, double amount) {
       
        System.out.println(amount + " deposited into account " + accountNumber);
    }

    public void withdraw(String accountNumber, double amount) {
    
        System.out.println(amount + " withdrawn from account " + accountNumber);
    }
}

