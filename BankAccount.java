public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double Amount; 
    
    public void deposit(double amnt){
        this.Amount +=amnt;
    }
    public void withdraw(double amnt){
        Amount=Amount-amnt;
        
    }
    public double getBalance(){
        if(this.Amount<=0){
            System.out.println("Insufficient Funds");
        }
        return this.Amount;
        
    }

    public BankAccount(String accNumber,String accname){
        Amount=0.0;
        accountNumber=accNumber;
        accountName=accname;
    }

    public static void main(String[] args) {
        BankAccount acc=new BankAccount("12345","joe");
        acc.deposit(1000);
        acc.withdraw(500);
        System.out.println(acc.getBalance());
        
    }
}
