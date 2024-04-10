package Intellect;

class BankAccount{
    private String accountNumber;
    private String accountHolderName;
    public double balance; 
    
    public void deposit(double amount){
        this.balance +=amount;
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("insufficient Fund");
        }
        balance=balance-amount;
        
    }
    public double getBalance(){ 
        // if(this.balance<=0){
        //     System.out.println("Insufficient Funds");
        // }
        return this.balance;      
    }
    public BankAccount(String accountNumber,String accountHolderName){
        this.balance=0.0;
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
    }
}

public class SavingsAccount extends BankAccount {
    private static final double interest_rate=0.03;

    public void calculateInterest(){
        double interest=balance*interest_rate;
        balance+=interest;

    }

    public SavingsAccount(String AccountNumber,String accountHolderName){
        super(AccountNumber, accountHolderName);
    }

    public static void main(String[] args) {
        SavingsAccount savingsAccount=new SavingsAccount("12345","john");
        savingsAccount.deposit(1000);
        // savingsAccount.withdraw(500);
        savingsAccount.calculateInterest();
        System.out.println(savingsAccount.getBalance());
        
    }

   
}
