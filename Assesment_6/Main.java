package Assesment_6;
public class Main {
    public static void main(String[] args) {
     
        BankOperationsManager manager = BankOperationsManager.getInstance();

       
        manager.openNewAccount("John Doe", "Savings");
        manager.openNewAccount("Jane Smith", "Checking");

      
        manager.deposit("1234567890", 1000);
        manager.withdraw("1234567890", 500);

      
        manager.closeAccount("9876543210");
    }
}
