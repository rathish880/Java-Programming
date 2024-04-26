

class BankAccount{
    public String accountNumber;
    public String accountHolderName;
    private double balance; 


    public double getbalance(){
        return balance;
    }
    public void setbalance(double balance){
        this.balance=balance;
    }
    
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
    }
    public void deductPenalty(){
        if(getBalance()>=PENALTY_AMOUNT){
           // balance-=PENALTY_AMOUNT;
            setbalance(getBalance() - PENALTY_AMOUNT);
        } 
        else{
            System.out.println("Insufficient balance to deduct penalty amount");
        } 
    }
}

class SavingsAccount extends BankAccount {
    private static final double interest_rate=0.03;

    public void calculateInterest(){
        double interest=getBalance()*interest_rate;
        //balance+=interest;
        setbalance(getBalance() + interest);

    }

    public SavingsAccount(String AccountNumber,String accountHolderName){
        super(AccountNumber, accountHolderName);
    }   
}
abstract class Transaction {
    protected BankAccount account;
    protected double amount;

    public Transaction(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public abstract void execute();

    public abstract void undo();
}

class DepositTransaction extends Transaction {
    public DepositTransaction(BankAccount account, double amount) {
        super(account, amount);
    }

    @Override
    public void execute() {
        account.deposit(amount);
    }

    @Override
    public void undo() {
        account.withdraw(amount);
    }
}

class WithdrawalTransaction extends Transaction {
    public WithdrawalTransaction(BankAccount account, double amount) {
        super(account, amount);
    }

    @Override
    public void execute() {
        account.withdraw(amount);
    }

    @Override
    public void undo() {
        account.deposit(amount);
    }
}
class mainly{
    public static void main(String[] args) {
        BankAccount currentAccount=new CurrentAccount("12345", "John Doe");
        currentAccount.deposit(1000);
        ((CurrentAccount) currentAccount).deductPenalty();  // PENALTY_AMOUNT = 10.0 (constant)
        System.out.println(currentAccount.getBalance()); 
        
        // Transaction deposit = new DepositTransaction(currentAccount, 500);
        // deposit.execute();
        // System.out.println(currentAccount.getBalance());
    }
}
