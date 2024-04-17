

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
class CurrentAccount extends BankAccount{
    private static final double PENALTY_AMOUNT = 10.0;

    public CurrentAccount(String accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
        //TODO Auto-generated constructor stub
    }
    public void deductPenalty(){
        if(balance>=PENALTY_AMOUNT){
            balance-=PENALTY_AMOUNT;
        }
        else{
            System.out.println("Insufficient balance to deduct penalty amount");
        } 
    }
}

class SavingsAccount extends BankAccount {
    private static final double interest_rate=0.03;

    public void calculateInterest(){
        double interest=balance*interest_rate;
        balance+=interest;

    }

    public SavingsAccount(String AccountNumber,String accountHolderName){
        super(AccountNumber, accountHolderName);
    }   
}
class main{
    public static void main(String[] args) {
        BankAccount currentAccount=new CurrentAccount("12345", "John Doe");
        currentAccount.deposit(1000);
        ((CurrentAccount) currentAccount).deductPenalty();  // PENALTY_AMOUNT = 10.0 (constant)
        System.out.println(currentAccount.getBalance());  
    }
}
