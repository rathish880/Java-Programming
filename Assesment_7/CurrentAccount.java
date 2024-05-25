package Assesment_7;

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
        this.overdraftLimit = 1000.0; 
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit >= amount)) {
            balance -= amount;
            //System.out.println(amount + " withdrawn from account " + accountNumber);
        } else {
            System.out.println("Invalid withdrawal amount or overdraft limit exceeded");
        }
    }
}

